package Thuchanh1;

import java.sql.*;
import javax.swing.*;

public class MyConnection {

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String URL = "jdbc:mysql://localhost:3306/quanlytaikhoan?useSSL=false&serverTimezone=UTC";
            
            String user = "root";
            String password = ""; 
            
            Connection con = DriverManager.getConnection(URL, user, password);
            return con;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

}
