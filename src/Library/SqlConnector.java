/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class SqlConnector {
    public static Connection connectDB(){
        String url = "jdbc:mysql://localhost:3306/library";
        String userName = "root";
        String password = "7777";
    

        try {
            Connection con = DriverManager.getConnection(url,userName, password);
            
            System.out.print("Database connected");
            
            return con;
        } catch (SQLException ex) {
            System.out.print("Database Not Connected");
            Logger.getLogger(SqlConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
