/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import base.IDAOUtils;
import conn.Data_Access;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ThongTin_DeTai;

/**
 *
 * @author Kien_BKHN
 */
public class ThongTin_DeTai_Business implements IDAOUtils<model.ThongTin_DeTai, String>{

    @Override
    public List<ThongTin_DeTai> getList(String conditions) {
        
        List<ThongTin_DeTai> lst= new ArrayList();
        
        String strSQL=" select * from thongtin_detai;";
       
        ThongTin_DeTai objDeTai= new ThongTin_DeTai();
       
        Data_Access dA= new Data_Access();
       
        Connection conn= dA.getConnection();
       
        try {
            Statement sT= conn.createStatement();
            
            ResultSet rS= sT.executeQuery(strSQL);
            
            while (rS.next()){
             
                objDeTai.setMaDeTai(rS.getString("MaDeTai"));
                
                objDeTai.setTenDeTai(rS.getString("TenDeTai"));
                
                objDeTai.setLoaiDeTai(rS.getString("LoaiDeTai"));
                
                objDeTai.setCapDeTai(rS.getString("CapDeTai"));
                
                objDeTai.setDonViChuTri(rS.getString("DonViChuTri"));
                
                objDeTai.setDonViThucHien(rS.getString("DonViThucHien"));
                
                objDeTai.setThoiGianBatDau(rS.getString("ThoiGianBatDau"));
                
                objDeTai.setThoiGianKetThuc(rS.getString("ThoiGianKetThuc"));
                
                objDeTai.setKinhPhiThucHien(rS.getDouble("KinhPhiThucHien"));
                
                objDeTai.setSoGioQuyDoi(rS.getDouble("SoGioQuyDoi"));
                
                lst.add(objDeTai);
    
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongTin_DeTai_Business.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lst;
    }

    @Override
    public ThongTin_DeTai getById(String maDeTai) {
        
        String strSQL=" select * from thongtin_detai where MaDeTai= '"+maDeTai+"';";
       
        ThongTin_DeTai objDeTai= new ThongTin_DeTai();
       
        Data_Access dA= new Data_Access();
       
        Connection conn= dA.getConnection();
       
        try {
            Statement sT= conn.createStatement();
            
            ResultSet rS= sT.executeQuery(strSQL);
            
            while (rS.next()){
             
                objDeTai.setMaDeTai(rS.getString("MaDeTai"));
                
                objDeTai.setTenDeTai(rS.getString("TenDeTai"));
                
                objDeTai.setLoaiDeTai(rS.getString("LoaiDeTai"));
                
                objDeTai.setCapDeTai(rS.getString("CapDeTai"));
                
                objDeTai.setDonViChuTri(rS.getString("DonViChuTri"));
                
                objDeTai.setDonViThucHien(rS.getString("DonViThucHien"));
                
                objDeTai.setThoiGianBatDau(rS.getString("ThoiGianBatDau"));
                
                objDeTai.setThoiGianKetThuc(rS.getString("ThoiGianKetThuc"));
                
                objDeTai.setKinhPhiThucHien(rS.getDouble("KinhPhiThucHien"));
                
                objDeTai.setSoGioQuyDoi(rS.getDouble("SoGioQuyDoi"));
    
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongTin_DeTai_Business.class.getName()).log(Level.SEVERE, null, ex);
        }
     
       
       return objDeTai;
    }

    @Override
    public boolean add(ThongTin_DeTai object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ThongTin_DeTai object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
