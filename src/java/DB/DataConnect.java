/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB;

import java.sql.*;
import java.util.logging.Logger;

/**
 *
 * @author icbt
 */
public class DataConnect {
    
    public static Connection getConnection()throws SQLException{    
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException e) {
        }
            
            //Connection con=DriverManager.getConnection("jdbc:odbc:clientDB"); 
        
       
       Connection con=DriverManager.getConnection("jdbc:ucanaccess://D:/Assignments/Java/clientWeb/clientDB.accdb");
      return con;
    }
}
