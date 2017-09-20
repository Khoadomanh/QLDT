/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import conn.Data_Access;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ThongTin_BangTheoDoi;
import model.ThongTin_CacChiPhiKhac;
import model.ThongTin_ChuyenDeDeTai;
import model.ThongTin_DeTai;
import model.ThongTin_GiangVien;

/**
 *
 * @author Kien_BKHN
 */
public class Utils {

    final static double PHAT = 1000;

    public static void themDeTaiVaoSQL(ThongTin_DeTai objDeTai) throws SQLException {

        String strSQL = "insert into thongtin_detai (MaDeTai, TenDeTai, LoaiDeTai, CapDeTai,"
                + "DonViChuTri, DonViThucHien, ThoiGianBatDau, ThoiGianKetThuc, KinhPhiThucHien, SoGioQuyDoi, ThuyetMinhDeTai) "
                + "values "
                + "('" + objDeTai.getMaDeTai() + "', '" + objDeTai.getTenDeTai() + "', '" + objDeTai.getLoaiDeTai() + "',"
                + " '" + objDeTai.getCapDeTai() + "','" + objDeTai.getDonViChuTri() + "', '" + objDeTai.getDonViThucHien() + "',"
                + " '" + objDeTai.getThoiGianBatDau() + "', '" + objDeTai.getThoiGianKetThuc() + "'," + objDeTai.getKinhPhiThucHien()
                + "," + objDeTai.getSoGioQuyDoi() + ",'"+objDeTai.getThuyetMinhDeTai()+"');";


        Data_Access dA = new Data_Access();

        Connection conn = dA.getConnection();

        Statement sT = conn.createStatement();

        int i = sT.executeUpdate(strSQL);

        conn.close();

    }

    public static void themGiangVienVaoSQL(ThongTin_GiangVien objGiangVien) throws SQLException {

        String strSQL = "insert into thongtin_giangvien (MaGV, MaDeTai, HoTenGV, ChucDanh, DienThoai, Email, DiaChi, BoMon, ChiBo, GhiChu, NgaySinh)"
                + "values ('" + objGiangVien.getMaGV() + "','" + objGiangVien.getMaDeTai() + "','" + objGiangVien.getHoTenGV() + "',"
                + " '" + objGiangVien.getChucDanh() + "', '" + objGiangVien.getDienThoai() + "', '" + objGiangVien.getEmail() + "'"
                + ",'" + objGiangVien.getDiaChi() + "', '" + objGiangVien.getBoMon() + "', '" + objGiangVien.getChiBo() + "','" + objGiangVien.getGhiChu() + "'"
                + ",'" + objGiangVien.getNgaySinh() + "');";

        Data_Access dA = new Data_Access();

        Connection conn = dA.getConnection();

        Statement sT = conn.createStatement();

        int i = sT.executeUpdate(strSQL);

        conn.close();

    }

    public static void xoa(String maDeTai) throws SQLException {

        String strSQL_1 = "delete from thongtin_detai where MaDeTai='" + maDeTai + "';";

        String strSQL_2 = "delete from thongtin_chuyende where MaDeTai='" + maDeTai + "';";

        String strSQL_3 = "delete from thongtin_chiphikhac where MaDeTai='" + maDeTai + "';";

        String strSQL_4 = "delete from thongtin_theodoi where MaDeTai='" + maDeTai + "';";

        String strSQL_5 = "delete from thongtin_giangvien where MaDeTai='" + maDeTai + "';";

        Data_Access dA = new Data_Access();

        Connection conn = dA.getConnection();

        Statement sT = conn.createStatement();

        int check;

        check = sT.executeUpdate(strSQL_5);

        check = sT.executeUpdate(strSQL_2);

        check = sT.executeUpdate(strSQL_3);

        check = sT.executeUpdate(strSQL_4);

        check = sT.executeUpdate(strSQL_1);

        conn.close();

    }

    public static void updateThongTinDeTai(ThongTin_DeTai objDeTai) throws SQLException {

        String sql = "update thongtin_detai set"
                + " TenDeTai='" + objDeTai.getTenDeTai() + "', LoaiDeTai='" + objDeTai.getLoaiDeTai() + "'"
                + " ,CapDeTai='" + objDeTai.getCapDeTai() + "', DonViChuTri='" + objDeTai.getDonViChuTri() + "'"
                + " ,DonViThucHien='" + objDeTai.getDonViThucHien()+ "'"
                + " ,KinhPhiThucHien='" + objDeTai.getKinhPhiThucHien()+ "', SoGioQuyDoi='" + objDeTai.getSoGioQuyDoi() + "'"
                + ", ThoiGianBatDau='" + objDeTai.getThoiGianBatDau() + "', ThoiGianKetThuc='" + objDeTai.getThoiGianKetThuc() + "' "
                + "where MaDeTai='" + objDeTai.getMaDeTai() + "';";

        Data_Access dA = new Data_Access();

        Connection conn = dA.getConnection();

        Statement sT = conn.createStatement();

        int check = sT.executeUpdate(sql);

        conn.close();

    }

    public static void updateThongTinGiangVien(ThongTin_GiangVien objGiangVien) throws SQLException {

        String sql = "update thongtin_giangvien set MaDeTai='" + objGiangVien.getMaDeTai() + "', HoTenGV='" + objGiangVien.getHoTenGV() + "'"
                + ", DienThoai='" + objGiangVien.getDienThoai() + "', ChucDanh='" + objGiangVien.getChucDanh() + "'"
                + ", DiaChi='" + objGiangVien.getDiaChi() + "', Email='" + objGiangVien.getEmail() + "'"
                + ", NgaySinh='" + objGiangVien.getNgaySinh() + "', GhiChu='" + objGiangVien.getGhiChu() + "'"
                + ", BoMon='" + objGiangVien.getBoMon()  + "', ChiBo='" + objGiangVien.getChiBo() +"'\n"
                + "where MaGV='" + objGiangVien.getMaGV() + "';";
        System.out.println(sql);

        Data_Access dA = new Data_Access();

        Connection conn = dA.getConnection();

        Statement sT = conn.createStatement();

        int check = sT.executeUpdate(sql);

        conn.close();
    }

    public static void themBangTheoDoiVaoSQL(ThongTin_BangTheoDoi objTheoDoi) throws SQLException {

        String strSQL = "insert into thongtin_theodoi(MaTheoDoi, MaDeTai, LiDo, SoTien, NgayThucHien, NguoiThucHien, GhiChu)"
                + "values ('" + objTheoDoi.getMaTheoDoi() + "','" + objTheoDoi.getMaDeTai() + "','" + objTheoDoi.getLiDo() + "',"
                + " '" + objTheoDoi.getSoTien() + "', '" + objTheoDoi.getNgayThucHien() + "', '" + objTheoDoi.getNguoiThucHien() + "'"
                + ",'" + objTheoDoi.getGhiChu() + "');";

        Data_Access dA = new Data_Access();

        Connection conn = dA.getConnection();

        Statement sT = conn.createStatement();

        int i = sT.executeUpdate(strSQL);

        conn.close();

    }

    public static void themChiPhiKhacVaoSQL(ThongTin_CacChiPhiKhac objChiPhiKhac) throws SQLException {

        String strSQL = "insert into thongtin_chiphikhac(MaChiKhac, MaDeTai, LiDo, SoTien, ThoiGianBatDau, ThoiGianKetThuc, NguoiThucHien, ThoiGianChi, GhiChu, TinhTrangChi)"
                + " values ('" + objChiPhiKhac.getMaChiKhac() + "','" + objChiPhiKhac.getMaDeTai() + "','" + objChiPhiKhac.getLiDo() + "',"
                + " '" + objChiPhiKhac.getSoTien() + "', '" + objChiPhiKhac.getThoiGianBatDau() + "', '" + objChiPhiKhac.getThoiGianKetThuc() + "',"
                + " '" + objChiPhiKhac.getNguoiThucHien() + "', '" + objChiPhiKhac.getThoiGianChi() + "', '" + objChiPhiKhac.getGhiChu() + "'"
                + ",'" + objChiPhiKhac.getTinhTrang() + "');";

        Data_Access dA = new Data_Access();

        Connection conn = dA.getConnection();

        Statement sT = conn.createStatement();

        int i = sT.executeUpdate(strSQL);

        conn.close();

    }

    public static void themChuyenDeDeTaiVaoSQL(ThongTin_ChuyenDeDeTai objChuyenDeDeTai) throws SQLException {
        String sql = "insert into thongtin_chuyende(MaChuyenDe,TenChuyenDe,MaDeTai,ThoiGianBatDau,ThoiGianKetThuc,"
                + "SoTien,NguoiThucHien,NgayKiHopDong,NgayThanhLyHopDong,SoHopDong,BaoCaoChuyenDe,HopDongVaThanhLy,TinhTrangThucHien,SoTienThue) "
                + "values ('" + objChuyenDeDeTai.getMaChuyenDe() + "','" + objChuyenDeDeTai.getTenChuyenDe() + "','" + objChuyenDeDeTai.getMaDeTai() + "',"
                + " '" + objChuyenDeDeTai.getThoiGianBatDau() + "', '" + objChuyenDeDeTai.getThoiGianKetThuc() + "', '" + objChuyenDeDeTai.getSoTien() + "',"
                + " '" + objChuyenDeDeTai.getNguoiThucHien() + "', '" + objChuyenDeDeTai.getNgayKiHopDong() + "', '" + objChuyenDeDeTai.getNgayThanhLyHopDong() + "',"
                + " '" + objChuyenDeDeTai.getSoHopDong() + "', '" + objChuyenDeDeTai.getBaoCaoChuyenDe() + "', '" + objChuyenDeDeTai.getHopDongVaThanhLy() + "',"
                + " '" + objChuyenDeDeTai.getTinhTrangThucHien() + "', '" + objChuyenDeDeTai.getSoTienThue() + "');";

        System.out.println(sql);

        Data_Access dA = new Data_Access();

        Connection conn = dA.getConnection();

        Statement sT = conn.createStatement();

        int i = sT.executeUpdate(sql);

        conn.close();

    }

    public static void updateThongTinChuyenDe(ThongTin_ChuyenDeDeTai objChuyenDe) throws SQLException {

        String sql = "update thongtin_chuyende set"
                + " TenChuyenDe='" + objChuyenDe.getTenChuyenDe() + "', ThoiGianBatDau='" + objChuyenDe.getThoiGianBatDau() + "'"
                + ", ThoiGianKetThuc='" + objChuyenDe.getThoiGianKetThuc() + "', SoTien='" + objChuyenDe.getSoTien() + "' "
                + "where MaChuyenDe='" + objChuyenDe.getMaChuyenDe() + "';";

        Data_Access dA = new Data_Access();

        Connection conn = dA.getConnection();

        Statement sT = conn.createStatement();

        int check = sT.executeUpdate(sql);

        conn.close();
    }

    public static void updateThongTinTheoDoi(ThongTin_BangTheoDoi objTheoDoi) throws SQLException {

        String sql = "update thongtin_theodoi set"
                + " LiDo = '" + objTheoDoi.getLiDo() + "', SoTien = '" + objTheoDoi.getSoTien() + "', NgayThucHien = '" + objTheoDoi.getNgayThucHien() + "', "
                + "NguoiThucHien = '" + objTheoDoi.getNguoiThucHien() + "', GhiChu = '" + objTheoDoi.getGhiChu() + "'\n"
                + "where MaTheoDoi='" + objTheoDoi.getMaTheoDoi() + "';";

        System.out.println(sql);
        Data_Access dA = new Data_Access();

        Connection conn = dA.getConnection();

        Statement sT = null;

        sT = conn.createStatement();

        int check = sT.executeUpdate(sql);

        conn.close();

    }
    
    public static void updateThongTinChiPhiKhac(ThongTin_CacChiPhiKhac objChiPhiKhac) throws SQLException {

        String sql = "update thongtin_chiphikhac set"
                + " MaDeTai='" + objChiPhiKhac.getMaDeTai()+ "', LiDo='" + objChiPhiKhac.getLiDo()+ "'"
                + ", SoTien='" + objChiPhiKhac.getSoTien()+ "'"
                + ", ThoiGianBatDau='" + objChiPhiKhac.getThoiGianBatDau()+ "', ThoiGianKetThuc='" + objChiPhiKhac.getThoiGianKetThuc()+ "' "
                + ", NguoiThucHien='" + objChiPhiKhac.getNguoiThucHien()+ "', ThoiGianChi='" + objChiPhiKhac.getThoiGianChi()+ "' "
                + ", GhiChu='" + objChiPhiKhac.getGhiChu()+ "', TinhTrangChi='" + objChiPhiKhac.getTinhTrang()+ "' "
                + "where MaChiKhac='" + objChiPhiKhac.getMaChiKhac()+ "';";
        
        System.out.println(""+sql);
        Data_Access dA = new Data_Access();

        Connection conn = dA.getConnection();

        Statement sT = conn.createStatement();

        int check = sT.executeUpdate(sql);

        conn.close();
    }
    
    public static double tienPhat(Date ngayTra_dh, Date currentDate){
        
        double soNgayQuaHan= Math.floor((currentDate.getTime() - ngayTra_dh.getTime())/(365*24*10000)) +1;
        
        
        return PHAT* soNgayQuaHan;
        
    }
}
