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
public class PhieuMuon {
    private String maMuon;
    private String maKhach;
    private String maSach;
    private Date ngayMuon;
    private Date NgayTra;
 
    
    public PhieuMuon() {
        
    }
    
    public PhieuMuon(String maMuon, String maKhach, String maSach, Date ngayMuon, Date NgayTra) {
        this.maMuon = maMuon;
        this.maKhach = maKhach;
        this.maSach = maSach;
        this.ngayMuon = ngayMuon;
        this.NgayTra = NgayTra;
        
    }

   
    
    public String getMaMuon() {
        return maMuon;
    }
    public void setMaMuon(String mm) {
        this.maMuon = mm;
    }
    
    public String getMaKhach() {
        return maKhach;
    }
    public void setMaKhach(String mm) {
        this.maKhach = mm;
    }
    
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String mm) {
        this.maSach = mm;
    }
    
    public Date getNgayMuon() {
        return ngayMuon;
    }
    public void setNgayMuon(Date nm) {
        this.ngayMuon = nm;
    }
    public Date getNgayTra() {
        return NgayTra;
    }
    public void setNgayTra(Date ht) {
        this.NgayTra = ht;
    }

 
    
    
}
