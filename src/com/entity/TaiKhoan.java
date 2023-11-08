/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

import java.util.Objects;

/**
 *
 * @author VINH
 */
public class TaiKhoan {

    private String tenTK, matKhau, hoTen, Email;
    private boolean vaiTro;

    public TaiKhoan() {
        super();
    }

    public TaiKhoan(String tenTK, String matKhau, String hoTen, String Email, boolean vaiTro) {
        super();
        this.tenTK = tenTK;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.Email = Email;
        this.vaiTro = vaiTro;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public boolean getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.tenTK);
        hash = 47 * hash + Objects.hashCode(this.matKhau);
        hash = 47 * hash + Objects.hashCode(this.hoTen);
        hash = 47 * hash + Objects.hashCode(this.vaiTro);
        hash = 47 * hash + Objects.hashCode(this.Email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TaiKhoan other = (TaiKhoan) obj;
        if (this.vaiTro != other.vaiTro) {
            return false;
        }
        if (!Objects.equals(this.tenTK, other.tenTK)) {
            return false;
        }
        if (!Objects.equals(this.matKhau, other.matKhau)) {
            return false;
        }
        if (!Objects.equals(this.hoTen, other.hoTen)) {
            return false;
        }
        return Objects.equals(this.Email, other.Email);
    }

    @Override
    public String toString() {
        return ""
                + "TaiKhoan{" + "TenTK=" + tenTK 
                + " ,matKhau=" + matKhau 
                + " ,hoTen=" + hoTen 
                + " ,vaiTro=" + vaiTro 
                + ", Email=" + Email 
                + "}";
    }

}
