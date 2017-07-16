/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author Gaara
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private String nhaXB;
    private int giaTien;
    private int soLuong;
    
    public Sach() {
        
    }
    
    public Sach(String maSach, String tenSach, String tenTacGia, String nhaXB, int giaTien, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.nhaXB = nhaXB;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
    }
    
    public String getMaSach() {
        return maSach;
    }
    
    public void setMaSach(String ms) {
        this.maSach = ms;
    }
    
    public String getTenSach() {
        return tenSach;
    }
    
    public void setTenSach(String ts) {
        this.tenSach = ts;
    }
    
    public String getTenTacGia() {
        return tenTacGia;
    }
    
    public void setTenTacGia(String ttg) {
        this.tenTacGia = ttg;
    }
    
    public String getNhaXB() {
        return nhaXB;
    }
    
    public void setNhaXB(String nxb) {
        this.nhaXB = nxb;
    }
    
    public int getGiaTien() {
        return giaTien;
    }
    
    public void setGiaTien(int gt) {
        this.giaTien = gt;
    }
    
    public int getSoLuong() {
        return soLuong;
    }
    
    public void setSoLuong(int sl) {
        this.soLuong = sl;
    }
}
