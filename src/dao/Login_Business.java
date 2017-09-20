/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conn.Data_Access;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Login;

/**
 *
 * @author TKien-BKsoft
 */
public class Login_Business {
    
    Data_Access dA;
    
    
    
    public Login_Business(){
        dA= new Data_Access();
    }
    
    
    public boolean isLogined( Login objLogin) {
        boolean check= false;
        
        String strSQL= "select * from login where TenDangNhap= '" +objLogin.getUseName()+ "' AND MatKhau= '"+ objLogin.getPassWord()+"';";
        
        Connection conn= dA.getConnection();
        
        ResultSet rS= null;
        
        try {
            Statement sT= conn.createStatement();
            
            rS= sT.executeQuery(strSQL);
            
            while(rS.next()){
                check= true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login_Business.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Login_Business.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
   
        return check;

    }
    
    public boolean isAdmin( Login objLogin) {
        
        String strSQL= "select * from login where TenDangNhap= '" +objLogin.getUseName()+ "' AND MatKhau= '"+ objLogin.getPassWord()+"';";
        
        Connection conn= dA.getConnection();
        
        ResultSet rS= null;
        
        int test = 0;
        
        try {
            Statement sT= conn.createStatement();
            
            rS= sT.executeQuery(strSQL);
            
            while(rS.next()){
                test= rS.getInt("Loai");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login_Business.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Login_Business.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
   
        return test==1;

    }
    
    public static String getPassWord(String useName){
        
        Data_Access dA= new Data_Access();
        
        Connection conn= dA.getConnection();
        
        String strSQL=" select MatKhau from login where TenDangNhap='"+useName+"';";
        
        String passWord=null;
        
        try {
            Statement sT= conn.createStatement();
            
            ResultSet rS= sT.executeQuery(strSQL);
            
            while(rS.next()){
                passWord= rS.getString("MatKhau");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login_Business.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Login_Business.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return passWord;
    }

}
