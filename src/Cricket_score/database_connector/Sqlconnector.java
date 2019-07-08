/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cricket_score.database_connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pankajan
 */
public class Sqlconnector implements Connector{
    private Connection con;
    private Statement statement = null;

    @Override
    public void connect() {
       
        
            String url="jdbc:mysql://localhost:3306/cricket_score";
            String user="root";
            String password="";
            Connection myCon = null;
            try {
             con = DriverManager.getConnection(url,user,password);
             statement = con.createStatement();
            
        } catch (Exception e) {
        }
      
       
    }
    
    

    @Override
    public void close() {
        
    }

    @Override
    public ResultSet fetch(String sql) {
        ResultSet resultset = null;
        try {
            resultset = statement.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Sqlconnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultset;
    }
    
}
