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
import model.ThongTin_BangTheoDoi;
import model.ThongTin_ChuyenDeDeTai;

/**
 *
 * @author Admin
 */
public class ThongTin_TheoDoi_Business implements IDAOUtils<model.ThongTin_BangTheoDoi, String>{

    @Override
    public List<ThongTin_BangTheoDoi> getList(String conditions) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ThongTin_BangTheoDoi getById(String maTheoDoi) {
        
        String strSQL=" select * from thongtin_theodoi where MaTheoDoi= '"+maTheoDoi+"';";
       
        ThongTin_BangTheoDoi objTheoDoi= new ThongTin_BangTheoDoi();
       
        Data_Access dA= new Data_Access();
       
        Connection conn= dA.getConnection();
       
        try {
            Statement sT= conn.createStatement();
            
            ResultSet rS= sT.executeQuery(strSQL);
            
            while (rS.next()){
             
                objTheoDoi.setMaTheoDoi(rS.getString("MaTheoDoi"));
                
                objTheoDoi.setMaDeTai(rS.getString("MaDeTai"));
                
                objTheoDoi.setLiDo(rS.getString("LiDo"));
                
                objTheoDoi.setSoTien(Double.parseDouble(rS.getString("SoTien")));
                
                objTheoDoi.setNgayThucHien(rS.getString("NgayThucHien"));
                
                objTheoDoi.setNguoiThucHien(rS.getString("NguoiThucHien"));
                
                objTheoDoi.setGhiChu(rS.getString("GhiChu"));
                
                //objChuyenDe.setNgayKiHopDong(rS.getString("NgayKiHopDong"));
                
                //objChuyenDe.setNgayThanhLyHopDong(rS.getString("NgayThanhLyHopDong"));
                
                //objChuyenDe.setSoHopDong(rS.getString("SoHopDong"));
                
                //objChuyenDe.setBaoCaoChuyenDe(rS.getString("BaoCaoChuyenDe"));
                
                //objChuyenDe.setHopDongVaThanhLy(rS.getString("HopDongVaThanhLy"));
                
                //objChuyenDe.setTinhTrangThucHien(rS.getString("TinhTrangThucHien"));
                
                //objChuyenDe.setSoTienThue(rS.getDouble("SoTienThue"));
    
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongTin_DeTai_Business.class.getName()).log(Level.SEVERE, null, ex);
        }
     
       
       return objTheoDoi;
    }

    @Override
    public boolean add(ThongTin_BangTheoDoi object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ThongTin_BangTheoDoi object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
