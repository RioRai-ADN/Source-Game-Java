/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rio.Rai
 */
public class sqlServerConnection {
    
    public static Connection getConnect() throws SQLException {
    
        Connection cn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "mysql");
        }catch(Exception e) {
            e.printStackTrace();
        }
        return cn;
    }
    
    public static void main(String args[]) throws SQLException {
    
        System.out.println(getConnect());
    }
}
