/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TruongPC
 */
public class DBconnect {
    
  private  static Connection con;
    
    public static Connection getConnect(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-PU4P78V:1433;databaseName=QLTV;Username=sa;Password = 29111995");
            
        } catch (Exception e) {
            System.out.println("Kết nối không thành công");
        }
        return con;
    }
    public static String testConnect() {
        try{
            con = DBconnect.getConnect();
            return "Kết nối thành công";
        }
        catch(Exception e) {
            return "Kết nối thất bại";
        }
    } 
}

    

