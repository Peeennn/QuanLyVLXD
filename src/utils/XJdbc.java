/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;


import java.sql.*;
/**
 *
 * @author VINH
 */
public class XJdbc {
    static String connectionUrl
                = "jdbc:sqlserver://Da-Doi-Ten\\SQLEXPRESS:1433;"
                + "database=QL_VL_XAYDUNG;"
                + "user=sa;"
                + "password=1;"
                + "encrypt=false;"
                + "trustServerCertificate=false;";    
    public static Connection getConnecttionDBS() throws SQLException {
        Connection conn = DriverManager.getConnection(XJdbc.connectionUrl);
        conn.setAutoCommit(false);
        return conn;
    }
     public static PreparedStatement preparedStatement(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(XJdbc.connectionUrl);
        PreparedStatement pstmt = null;
        if (sql.trim().startsWith("{")) {
            pstmt = conn.prepareCall(sql); //proc
        } else {
            pstmt = conn.prepareStatement(sql); //SQL
        }
        for (int i = 0; i < args.length; i++) {
            pstmt.setObject(i + 1, args[i]);
        }
        return pstmt;
    }

    public static ResultSet executeQuery(String sql, Object... args) {
        try {
            PreparedStatement pstmt = preparedStatement(sql, args);
            try {
                return pstmt.executeQuery();
            } finally {

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void executeUpdate(String sql, Object... args) {
        try {
            PreparedStatement pstmt = preparedStatement(sql, args);
            try {
                pstmt.executeUpdate();
            } finally {
                pstmt.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
