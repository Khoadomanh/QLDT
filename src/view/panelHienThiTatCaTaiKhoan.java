/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import conn.Data_Access;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Login;

/**
 *
 * @author Kien_BKHN
 */
public class panelHienThiTatCaTaiKhoan extends javax.swing.JPanel {

    /**
     * Creates new form panelHienThiTaiKhoan
     */
    public panelHienThiTatCaTaiKhoan() {
        initComponents();

        hienThiTatCaTaiKhoan();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTaiKhoan = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();

        jTableTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableTaiKhoan);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThem))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        Login obj = new Login();

        int selectedItem = jTableTaiKhoan.getSelectedRow();

        if (selectedItem == -1) {

            JOptionPane.showMessageDialog(null, "Chưa chọn tài khoản muốn sửa");
        } else {

            obj.setPassWord(jTableTaiKhoan.getValueAt(selectedItem, 1) + "");

            obj.setUseName(jTableTaiKhoan.getValueAt(selectedItem, 0) + "");

            String strSQL = "UPDATE `project1`.`login` SET `MatKhau`='"+obj.getPassWord()+"' WHERE `TenDangNhap`='"+obj.getUseName()+"';";
            
            Data_Access dA = new Data_Access();

            Connection conn = dA.getConnection();

            try {
                Statement sT = conn.createStatement();

                sT.executeUpdate(strSQL);

                JOptionPane.showMessageDialog(null, "Thay đổi thành công");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Có lỗi khi thay đổi tài khoản");
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(panelHienThiTatCaTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        hienThiTatCaTaiKhoan();


    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        
        formThemMoiTaiKhoan formThemMoiTaiKhoan= new formThemMoiTaiKhoan(this);
        
        formThemMoiTaiKhoan.setVisible(true);
        
        formThemMoiTaiKhoan.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnThemActionPerformed

    public void hienThiTatCaTaiKhoan() {
        //tạo đối tượng defaultmodeltable
        String[] objTitle = new String[]{"Tên đăng nhập", "Mật khẩu", "Loại tài khoản"};

        DefaultTableModel model = new DefaultTableModel(objTitle, 0);

        //kết nối với DB
        String strSQL = "select * from login;";

        Data_Access dA = new Data_Access();

        Connection conn = dA.getConnection();

        try {
            Statement sT = conn.createStatement();

            ResultSet rS = sT.executeQuery(strSQL);

            while (rS.next()) {
                Object[] obj = new Object[3];

                obj[0] = rS.getString("TenDangNhap");

                obj[1] = rS.getString("MatKhau");

                obj[2] = rS.getString("Loai");

                model.addRow(obj);
            }

            jTableTaiKhoan.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(panelHienThiTatCaTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(panelHienThiTatCaTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
