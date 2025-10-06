package FTPServer;

import java.sql.*;
import javax.swing.*;

public class MyConnection {
    public Connection getConnection(){
        try{
            /*Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost/quanlytaikhoan?user=root&password="; 
            Connection con = DriverManager.getConnection(URL);*/
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;DatabaseName=quanlytaikhoan;user=huy;password=123456;encrypt=false;trustServerCertificate=true;";
            Connection con = DriverManager.getConnection(url);
            
            return con;
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString(),"Loi",JOptionPane.ERROR_MESSAGE);
            return null;
        }
//2. SQL-Server 
//        try {
//            // Driver MySQL (5.x thì dùng com.mysql.jdbc.Driver, 8.x thì dùng com.mysql.cj.jdbc.Driver)
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            //1. MySQL
//                        // URL kết nối//==localhost:1433
//            String url = "jdbc:sqlserver://localhost;encrypt=false;"
//                    + "trustServerCertificate=true;Database=quanlytaikhoan"
//                    + ";user=huy;password=123456";
//            
//            Connection con = DriverManager.getConnection(url);
//            return con;
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex.toString(), "Lỗi", JOptionPane.ERROR_MESSAGE);
//            return null;
//        }

    } 
}
