/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.PhieuMuon;
import DTO.Sach;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Gaara
 */
public class PhieuMuonDAL {
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static ResultSet showTextfield(String sql) {
        try {
            ps = DBconnect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
     public static void InsertPhieu(PhieuMuon p) {
        String sql = "insert into PHIEU_MUON values(?,?,?,?,?)";
        try {
            ps = DBconnect.getConnect().prepareStatement(sql);
            ps.setString(1, p.getMaMuon());
            ps.setString(2, p.getMaKhach());
            ps.setString(3, p.getMaSach());
            ps.setDate(4, p.getNgayMuon());
            ps.setDate(5, p.getNgayTra());
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm phiếu thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "phiếu không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean UpdatePhieu(PhieuMuon p) {
        try {
            ps = DBconnect.getConnect().prepareStatement("UPDATE PHIEU_MUON SET  Ma_Khach_hang = ?, Ma_Sach = ?,"
                    + "Ngay_muon = ?, Ngaytra = ? where Ma_Phieu_muon = ?");
            ps.setString(1, p.getMaMuon());
            ps.setString(2, p.getMaKhach());
            ps.setString(3, p.getMaSach());   
            ps.setDate(4, p.getNgayMuon());
            ps.setDate(5, p.getNgayTra());
           
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
            
        }
    }
    
    public boolean DeletePhieu(String ms) {
        try {
            ps = DBconnect.getConnect().prepareStatement("DELETE FROM PHIEU_MUON WHERE Ma_Phieu_muon = ?");
            ps.setString(1, ms);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
}}
