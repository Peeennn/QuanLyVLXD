/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

/**
 *
 * @author VINH
 */
public class SanPham {
    private String maSP, tenSP;
    private int gia;
    private String XuatXu, DonViTinh, Hinh;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int gia, String XuatXu, String DonViTinh, String Hinh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.XuatXu = XuatXu;
        this.DonViTinh = DonViTinh;
        this.Hinh = Hinh;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getXuatXu() {
        return XuatXu;
    }

    public void setXuatXu(String XuatXu) {
        this.XuatXu = XuatXu;
    }

    public String getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(String DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }
    
    @Override
    public String toString(){
        return "SanPham{" + "maSP=" +maSP + " ,tenSP=" + tenSP + " ,gia="+gia +" ,XuatXu=" +XuatXu + " ,donViTinh=" + DonViTinh + " ,Hinh=" + Hinh + "}"; 
    }
}
