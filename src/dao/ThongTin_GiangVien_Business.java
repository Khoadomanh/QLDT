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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ThongTin_GiangVien;

/**
 *
 * @author Kien_BKHN
 */
public class ThongTin_GiangVien_Business implements IDAOUtils<ThongTin_GiangVien, String>{

    @Override
    public List<ThongTin_GiangVien> getList(String conditions) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ThongTin_GiangVien getById(String maGV) {
        
        String strSQL=" select * from thongtin_giangvien where MaGV= '"+maGV+"';";
        
        ThongTin_GiangVien objGiangVien= new ThongTin_GiangVien();
        
        Data_Access dA= new Data_Access();
        
        Connection conn= dA.getConnection();
        
        try {
            Statement sT= conn.createStatement();
            
            ResultSet rS= sT.executeQuery(strSQL);
            
            while(rS.next()){
                
                objGiangVien.setMaGV(rS.getString("MaGV"));
                
                objGiangVien.setMaDeTai(rS.getString("MaDeTai"));
                
                objGiangVien.setHoTenGV(rS.getString("HoTenGV"));
                
                objGiangVien.setChucDanh(rS.getString("ChucDanh"));
                
                objGiangVien.setDienThoai(rS.getString("DienThoai"));
                
                objGiangVien.setEmail(rS.getString("Email"));
                
                objGiangVien.setDiaChi(rS.getString("DiaChi"));
                
                objGiangVien.setBoMon(rS.getString("BoMon"));
                
                objGiangVien.setChiBo(rS.getString("ChiBo"));
                
                objGiangVien.setGhiChu(rS.getString("GhiChu"));
                
                objGiangVien.setNgaySinh(rS.getString("NgaySinh"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongTin_GiangVien_Business.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return objGiangVien;
    }

    @Override
    public boolean add(ThongTin_GiangVien object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ThongTin_GiangVien object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




    
}
