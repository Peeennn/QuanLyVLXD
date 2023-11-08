/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DAO;

import java.sql.*;
import com.entity.SanPham;
import java.util.ArrayList;
import java.util.List;
import utils.XJdbc;

/**
 *
 * @author VINH
 */
public class SanPhamDAO extends DAOInterface<SanPham, String> {

    String INSERT_SQL = "INSERT INTO SANPHAM (MaSanPham, TenSanPham, Gia, XuatXu, DonViTinh, Hinh) VALUES (?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE SANPHAM SET TenSanPham = ?, Gia=?, XuatXu=? , DonViTinh =?, Hinh=? WHERE MaSanPham =?";
    String DELETE_SQL = "DELETE SANPHAM WHERE MaSanPham =?";
    String SELECT_ALL_SQL = "SELECT * FROM SANPHAM";
    String SELECT_BY_ID_SQL = "SELECT * FROM SANPHAM WHERE MaSanPham =?";

    @Override
    public void insert(SanPham entity) {
        XJdbc.executeUpdate(INSERT_SQL,
                entity.getMaSP(),
                entity.getTenSP(),
                entity.getGia(),
                entity.getXuatXu(),
                entity.getDonViTinh(),
                entity.getHinh()
        );
    }

    @Override
    public void update(SanPham entity) {
        XJdbc.executeUpdate(UPDATE_SQL,
                entity.getTenSP(),
                entity.getGia(),
                entity.getXuatXu(),
                entity.getDonViTinh(),
                entity.getHinh(),
                entity.getMaSP()
        );
    }

    @Override
    public void delete(String id) {
        XJdbc.executeUpdate(DELETE_SQL, id);
    }

    @Override
    public SanPham selectById(String id) {
        List<SanPham> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<SanPham> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    protected List<SanPham> selectBySQL(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.executeQuery(sql, args);
            while (rs.next()) {
                SanPham entity = new SanPham();
                entity.setMaSP(rs.getString("MaSanPham"));
                entity.setTenSP(rs.getString("TenSanPham"));
                entity.setGia(rs.getInt("Gia"));
                entity.setXuatXu(rs.getString("XuatXu"));
                entity.setDonViTinh(rs.getString("DonViTinh"));
                entity.setHinh(rs.getString("Hinh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
