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
import model.ThongTin_CacChiPhiKhac;

/**
 *
 * @author Admin
 */
public class ThongTin_ChiPhiKhac_Business implements IDAOUtils<model.ThongTin_CacChiPhiKhac, String>{

    @Override
    public List<ThongTin_CacChiPhiKhac> getList(String conditions) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ThongTin_CacChiPhiKhac getById(String maChiKhac) {
        
        String strSQL=" select * from thongtin_chiphikhac where MaChiKhac= '"+maChiKhac+"';";
       
        ThongTin_CacChiPhiKhac objChiPhiKhac= new ThongTin_CacChiPhiKhac();
       
        Data_Access dA= new Data_Access();
       
        Connection conn= dA.getConnection();
       
        try {
            Statement sT= conn.createStatement();
            
            ResultSet rS= sT.executeQuery(strSQL);
            
            while (rS.next()){
             
                objChiPhiKhac.setMaChiKhac(rS.getString("MaChiKhac"));
                
                objChiPhiKhac.setMaDeTai(rS.getString("MaDeTai"));
                
                objChiPhiKhac.setLiDo(rS.getString("LiDo"));
                
                objChiPhiKhac.setSoTien(Double.parseDouble(rS.getString("SoTien")));
                
                objChiPhiKhac.setThoiGianBatDau(rS.getString("ThoiGianBatDau"));
                
                objChiPhiKhac.setThoiGianKetThuc(rS.getString("ThoiGianKetThuc"));
                
                objChiPhiKhac.setNguoiThucHien(rS.getString("NguoiThucHien"));
                
                objChiPhiKhac.setThoiGianChi(rS.getString("ThoiGianChi"));
                
                objChiPhiKhac.setGhiChu(rS.getString("GhiChu"));
                
                objChiPhiKhac.setTinhTrang(rS.getString("TinhTrangChi"));
                
                //objChuyenDe.setBaoCaoChuyenDe(rS.getString("BaoCaoChuyenDe"));
                
                //objChuyenDe.setHopDongVaThanhLy(rS.getString("HopDongVaThanhLy"));
                
                //objChuyenDe.setTinhTrangThucHien(rS.getString("TinhTrangThucHien"));
                
                //objChuyenDe.setSoTienThue(rS.getDouble("SoTienThue"));
    
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThongTin_DeTai_Business.class.getName()).log(Level.SEVERE, null, ex);
        }
     
       
       return objChiPhiKhac;
    }

    @Override
    public boolean add(ThongTin_CacChiPhiKhac object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ThongTin_CacChiPhiKhac object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
