/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TKien-BKsoft
 */
public class Data_Access {
    
    private  static  final  String JDBC_DRIVER= "com.mysql.jdbc.Driver";
    private  static  final  String  DATABASE_LINK= "jdbc:mysql://localhost/project1";
    
    public Connection getConnection (){
    Connection conn= null;
    
    
        try {
            //nạp driver của db tương ứng cần làm việc
            Class.forName(JDBC_DRIVER);
            
            conn=DriverManager.getConnection(DATABASE_LINK,"honganhdo","honganh09");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Data_Access.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return conn;
    
    }
    
}
