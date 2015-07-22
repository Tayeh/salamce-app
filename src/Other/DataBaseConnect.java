/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mtayeh
 */
public class DataBaseConnect {
    private static Connection conn;
    
      private static final DataBaseConnect dbc = new DataBaseConnect();
    private DataBaseConnect(){
    
        try {
          Class.forName("com.mysql.jdbc.Driver");
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SalamceDB?useUnicode=true&characterEncoding=utf-8", "root", "root");
        }
        catch (Exception sqle) {
            sqle.printStackTrace();
        }
    
    }
    
    public static DataBaseConnect db ()
    {
        if (dbc == null)
        {
            new DataBaseConnect();
        }
       
        return dbc;
    }
    public static Connection ConnectDB() {
   
            return conn;

    }
}