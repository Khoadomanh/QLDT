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
import model.ThongTin_ChuyenDeDeTai;

/**
 *
 * @author Kien_BKHN
 */
public class ThongTin_ChuyenDe_Business implements IDAOUtils<model.ThongTin_ChuyenDeDeTai, String>{

    @Override
    public List<ThongTin_ChuyenDeDeTai> getList(String conditions) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ThongTin_ChuyenDeDeTai getById(String maChuyenDe) {
        
        String strSQL=" select * from thongtin_chuyende where MaChuyenDe= '"+maChuyenDe+"';";
       
        ThongTin_ChuyenDeDeTai objChuyenDe= new ThongTin_ChuyenDeDeTai();
       
        Data_Access dA= new Data_Access();
       
        Connection conn= dA.getConnection();
       
        try {
            Statement sT= conn.createStatement();
            
            ResultSet rS= sT.executeQuery(strSQL);
            
            while (rS.next()){
             
                objChuyenDe.setMaChuyenDe(rS.getString("MaChuyenDe"));
                
                objChuyenDe.setTenChuyenDe(rS.getString("TenChuyenDe"));
                
                objChuyenDe.setMaDeTai(rS.getString("MaDeTai"));
                
                objChuyenDe.setThoiGianBatDau(rS.getString("ThoiGianBatDau"));
                
                objChuyenDe.setThoiGianKetThuc(rS.getString("ThoiGianKetThuc"));
                
                objChuyenDe.setSoTien(Double.parseDouble(rS.getString("SoTien")));
                
                objChuyenDe.setNguoiThucHien(rS.getString("NguoiThucHien"));
                
                objChuyenDe.setNgayKiHopDong(rS.getString("NgayKiHopDong"));
                
                objChuyenDe.setNgayThanhLyHopDong(rS.getString("NgayThanhLyHopDong"));
                
                objChuyenDe.setSoHopDong(rS.getString("SoHopDong"));
                
                objChuyenDe.setBaoCaoChuyenDe(rS.getString("BaoCaoChuyenDe"));
                
                objChuyenDe.setHopDongVaThanhLy(rS.getString("HopDongVaThanhLy"));
                
                objChuyenDe.setTinhTrangThucHien(rS.getString("TinhTrangThucHien"));
                
                objChuyenDe.setSoTienThue(rS.getDouble("SoTienThue"));
    
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongTin_DeTai_Business.class.getName()).log(Level.SEVERE, null, ex);
        }
     
       
       return objChuyenDe;
    }

    @Override
    public boolean add(ThongTin_ChuyenDeDeTai object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ThongTin_ChuyenDeDeTai object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
