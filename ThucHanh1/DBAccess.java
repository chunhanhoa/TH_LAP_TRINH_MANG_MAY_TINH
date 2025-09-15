package Thuchanh1;

import java.sql.*;

public class DBAccess {

    private Connection con;
    private Statement stmt;

    public DBAccess() {
        try {
            // connect with MySQL
            //MyConnection myCon = new MyConnection();
            // connect with SQL Server
            SQLServer_Connection myCon = new SQLServer_Connection();
            con = myCon.getConnection();
            stmt = con.createStatement();
        } catch (Exception e) {

        }
    }

    public int Update(String str) {
        try {
            int i = stmt.executeUpdate(str);
            return i;
        } catch (Exception e) {
            return -1;
        }
    }

    public ResultSet Query(String str) {
        try {
            ResultSet rs = stmt.executeQuery(str);
            return rs;
        } catch (Exception e) {
            return null;
        }
    }
}
