/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DAL.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author TruongPC
 */
public class UPDATE {
    public static PreparedStatement ps = null;  // biểu thức thực thi
    public static ResultSet rs = null;
    public static Connection con = DBconnect.getConnect();
    
    
    // load du lieu len bang
    public static void LoadData (String sql,JTable tb) {
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            tb.setModel((DbUtils.resultSetToTableModel(rs)));
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e ,"Thông báo lỗi",1);
        }
    }
                                  // hàm đổ một dòng dữ liệu từ bảng lên textField
    public static ResultSet ShowTextField(String sql) {
        try{
            ps = con.prepareStatement(sql);
            return ps.executeQuery(); 
        }
        catch(Exception e) {
            return null;
            //JOptionPane.showMessageDialog(null, e, "Thông báo lỗi", 1);
        }
    }
    
}
