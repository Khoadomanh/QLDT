/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import conn.Data_Access;
import dao.ThongTin_GiangVien_Business;
import dao.ThongTin_TheoDoi_Business;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ThongTin_BangTheoDoi;
import model.ThongTin_GiangVien;

public class panelHienThiChiTietGiangVien extends javax.swing.JPanel {

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public panelHienThiChiTietGiangVien() {
        initComponents();

        hienThiThongTin();

    }

    public void hienthiThongTin_ChiTiet() {
        //lấy mã đề tài từ cột đã chọn
        int selectedRow = jTableHienThi.getSelectedRow();

        String maGV = jTableHienThi.getValueAt(selectedRow, 0) + "";

        //gọi lớp jlist
        DefaultListModel model = new DefaultListModel();

        //lấy dữ liệu từ csdl
        String strSQL = "select * from thongtin_giangvien "
                + "where MaGV='" + maGV + "';";

        Data_Access dA = new Data_Access();

        Connection conn = dA.getConnection();

        try {
            Statement sT = conn.createStatement();

            ResultSet rS = sT.executeQuery(strSQL);

            while (rS.next()) {

                model.addElement("Mã giảng viên : " + rS.getString("MaGV"));

                model.addElement("Mã đề tài : " + rS.getString("MaDeTai"));

                model.addElement("Họ tên GV : " + rS.getString("HoTenGV"));

                model.addElement("Chức danh : " + rS.getString("ChucDanh"));

                model.addElement("Số điện thoại : " + rS.getString("DienThoai"));

                model.addElement("Email : " + rS.getString("Email"));

                model.addElement("DiaChi : " + rS.getString("DiaChi"));

                model.addElement("Bộ Môn : " + rS.getString("BoMon"));

                model.addElement("Chi bộ : " + rS.getString("ChiBo"));

                model.addElement("Ghi chú : " + rS.getString("GhiChu"));

                model.addElement("Ngày sinh : " + dateFormat.format(rS.getDate("NgaySinh")));


            }

            jListHienThi.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(panelHienThiChiTietGiangVien.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(panelHienThiChiTietGiangVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    public void hienthiThongTin_ChiTiet(String maGV) {

        //gọi lớp jlist
        DefaultListModel model = new DefaultListModel();

        //lấy dữ liệu từ csdl
        String strSQL = "select * from thongtin_giangvien "
                + "where MaGV='" + maGV + "';";

        Data_Access dA = new Data_Access();

        Connection conn = dA.getConnection();

        try {
            Statement sT = conn.createStatement();

            ResultSet rS = sT.executeQuery(strSQL);

            while (rS.next()) {

                model.addElement("Mã giảng viên : " + rS.getString("MaGV"));

                model.addElement("Mã đề tài : " + rS.getString("MaDeTai"));

                model.addElement("Họ tên GV : " + rS.getString("HoTenGV"));

                model.addElement("Chức danh : " + rS.getString("ChucDanh"));

                model.addElement("Số điện thoại : " + rS.getString("DienThoai"));

                model.addElement("Email : " + rS.getString("Email"));

                model.addElement("DiaChi : " + rS.getString("DiaChi"));

                model.addElement("Bộ Môn : " + rS.getString("BoMon"));

                model.addElement("Chi bộ : " + rS.getString("ChiBo"));

                model.addElement("Ghi chú : " + rS.getString("GhiChu"));

                model.addElement("Ngày sinh : " + dateFormat.format(rS.getDate("NgaySinh")));


            }

            jListHienThi.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(panelHienThiChiTietGiangVien.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(panelHienThiChiTietGiangVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    

    public void hienThiThongTin() {
        //tạo bảng 

        String[] objTitle = new String[]{"Mã giảng viên", "Mã đề tài", "Họ và tên GV", "Chức danh", "Bộ môn"};

        DefaultTableModel model = new DefaultTableModel(objTitle, 0);

        // lấy dữ liệu từ cơ sở dữ liệu
        String strSQL = "select * from  thongtin_giangvien";

        Data_Access dA = new Data_Access();

        Connection conn = dA.getConnection();

        try {
            Statement sT = conn.createStatement();

            ResultSet rS = sT.executeQuery(strSQL);

            while (rS.next()) {

                Object[] obj = new Object[5];

                obj[0] = rS.getString("MaGV");

                obj[1] = rS.getString("MaDeTai");

                obj[2] = rS.getString("HoTenGV");

                obj[3] = rS.getString("ChucDanh");

                obj[4] = rS.getString("BoMon");

                model.addRow(obj);

            }

            jTableHienThi.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(panelHienThiChiTietGiangVien.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(panelHienThiChiTietGiangVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListHienThi = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableHienThi = new javax.swing.JTable();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();

        jScrollPane1.setViewportView(jListHienThi);

        jTableHienThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHienThiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableHienThi);

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/EditTableHS.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHienThiMouseClicked
        hienthiThongTin_ChiTiet();
    }//GEN-LAST:event_jTableHienThiMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        int selectedRows = jTableHienThi.getSelectedRow();

        if (selectedRows == -1) {
            JOptionPane.showMessageDialog(this, "Chưa chọn thông tin giảng viên muốn xoá");

            return;

        }

        String maTheoDoi = jTableHienThi.getValueAt(selectedRows, 0) + "";

        int check = JOptionPane.showConfirmDialog(null, "Bạn có muốn xoá không", "Xác nhận", JOptionPane.YES_NO_CANCEL_OPTION);

        if (check == JOptionPane.YES_OPTION) {

            try {
                utils.Utils.xoa(maTheoDoi);
            } catch (SQLException ex) {
                Logger.getLogger(panelHienThiChiTietGiangVien.class.getName()).log(Level.SEVERE, null, ex);
            }

            hienThiThongTin();

            DefaultListModel model = new DefaultListModel();

            jListHienThi.setModel(model);

        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        int selectedRow = jTableHienThi.getSelectedRow();

        if (selectedRow == -1) {

            JOptionPane.showMessageDialog(null, "Chưa chọn giảng viên muốn sửa");

            return;
        } else {

            String maGV = jTableHienThi.getValueAt(selectedRow, 0) + "";
            ThongTin_GiangVien objGiangVien = new ThongTin_GiangVien();

            ThongTin_GiangVien_Business dt_bus = new ThongTin_GiangVien_Business();
            objGiangVien = dt_bus.getById(maGV);

            frmSuaThongTinGiangVien frameSua = new frmSuaThongTinGiangVien(this, objGiangVien);

            frameSua.setVisible(true);

            frameSua.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnSuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnXoa;
    private javax.swing.JList<String> jListHienThi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableHienThi;
    // End of variables declaration//GEN-END:variables
}
