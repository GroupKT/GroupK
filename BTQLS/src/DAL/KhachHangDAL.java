/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import static DAL.SachDAL.ps;
import DTO.KhachHang;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Gaara
 */
public class KhachHangDAL {
    public static PreparedStatement ps;
    public static ResultSet rs;
    
 
    // viet ham thuc hieen insert
     public static void InsertKhachHang(KhachHang kh) {
        String sql = "insert into KHACH_HANG values(?,?,?,?,?)";
        try {
            ps = DBconnect.getConnect().prepareStatement(sql);
            ps.setString(1, kh.getMaKH());
            ps.setString(2, kh.getTenKH());
            ps.setDate(3, kh.getBirth());
            ps.setString(4, kh.getDiaChi());
            ps.setString(5, kh.getPhone());
          
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm khách hàng thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Khách hàng không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean UpdateKhachHang(KhachHang kh) {
        try {
            ps = DBconnect.getConnect().prepareStatement("UPDATE KHACH_HANG SET  Ten_Khach_hang = ?,"
                    + "Ngay_sinh = ?, Dia_chi = ?, Phone = ? where Ma_Khach_hang = ?");
            ps.setString(1, kh.getMaKH());
            ps.setString(2, kh.getTenKH());
            ps.setDate(3, kh.getBirth());
            ps.setString(4, kh.getDiaChi());
            ps.setString(5, kh.getPhone());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean UpKhachHang(KhachHang kh){
                try {
            ps = DBconnect.getConnect().prepareStatement("UPDATE KHACH_HANG SET  Ten_Khach_hang = ?,"
                    + "Ngay_sinh = ?, Dia_chi = ?, Phone = ? where Ma_Khach_hang = ?");
            ps.setString(1, kh.getMaKH());
            ps.setString(2, kh.getTenKH());
            ps.setDate(3, kh.getBirth());
            ps.setString(4, kh.getDiaChi());
            ps.setString(5, kh.getPhone());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean DeleteKhachHang(String maKH) {
        try {
            ps = DBconnect.getConnect().prepareStatement("DELETE FROM KHACH_HANG WHERE Ma_Khach_hang = ?");
            ps.setString(1, maKH);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }

    public void InsertPhieu(KhachHang kh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
