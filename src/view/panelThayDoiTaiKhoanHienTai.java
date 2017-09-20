
package view;

import conn.Data_Access;
import dao.Login_Business;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Login;

/**
 *
 * @author Kien_BKHN
 */
public class panelThayDoiTaiKhoanHienTai extends javax.swing.JPanel {

    Login objLogin;
    
    public panelThayDoiTaiKhoanHienTai(Login objLogin){
        initComponents();
        
        this.objLogin= objLogin;
        
        txtTaiKhoanHienTai.setText(this.objLogin.getUseName());
        
        txtTaiKhoanHienTai.setEnabled(false);
    }
    
    public panelThayDoiTaiKhoanHienTai() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnThayDoi = new javax.swing.JButton();
        txtTaiKhoanHienTai = new javax.swing.JTextField();
        txtMatKhauCu = new javax.swing.JPasswordField();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        txtNhapLaiMatKhauMoi = new javax.swing.JPasswordField();

        jLabel1.setText("Tên tài khoản hiện tại:");

        jLabel2.setText("Nhập mật khẩu cũ:");

        jLabel3.setText("Nhập mật khẩu mới:");

        jLabel4.setText("Nhập lại mật khẩu mới:");

        btnThayDoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Update.png"))); // NOI18N
        btnThayDoi.setText("Thay đổi");
        btnThayDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThayDoiActionPerformed(evt);
            }
        });

        txtTaiKhoanHienTai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanHienTaiActionPerformed(evt);
            }
        });

        txtMatKhauCu.setText("jPasswordField1");

        txtMatKhauMoi.setText("jPasswordField2");

        txtNhapLaiMatKhauMoi.setText("jPasswordField3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnThayDoi)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTaiKhoanHienTai)
                            .addComponent(txtMatKhauCu, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(txtMatKhauMoi)
                            .addComponent(txtNhapLaiMatKhauMoi)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTaiKhoanHienTai))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMatKhauCu))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMatKhauMoi))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNhapLaiMatKhauMoi))
                .addGap(18, 18, 18)
                .addComponent(btnThayDoi))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTaiKhoanHienTaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaiKhoanHienTaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanHienTaiActionPerformed

    private void btnThayDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThayDoiActionPerformed
        txtTaiKhoanHienTai.setText(objLogin.getUseName());
        
        String strMatKhauCu= txtMatKhauCu.getText();
        
        String strMatKhauMoi= txtMatKhauMoi.getText();
        
        String strNhapLaiMatKhauMoi= txtNhapLaiMatKhauMoi.getText();
        
        if( ! strMatKhauCu.equals(Login_Business.getPassWord(objLogin.getUseName()))){
            
            JOptionPane.showMessageDialog(null, "Mật khẩu cũ không đúng");
            
            return;
        }
        else if( ! strMatKhauMoi.equals(strNhapLaiMatKhauMoi)){
            
            JOptionPane.showMessageDialog(null, "Mật khẩu mới và nhập lại mật khẩu mới không khớp");
            
            return;
        }
        else{
        String strSQL= "update login set MatKhau='"+strMatKhauMoi+"' where TenDangNhap='"+objLogin.getUseName()+"';";
        
        Data_Access dA= new Data_Access();
        
        Connection conn= dA.getConnection();
        
        try {
            Statement sT= conn.createStatement();
            
            sT.executeUpdate(strSQL);  
            
            
            JOptionPane.showMessageDialog(null, "Thay đổi thành công");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Có lỗi khi thay đổi tài khoản");
        } finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(panelHienThiTatCaTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }//GEN-LAST:event_btnThayDoiActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThayDoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtMatKhauCu;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtNhapLaiMatKhauMoi;
    private javax.swing.JTextField txtTaiKhoanHienTai;
    // End of variables declaration//GEN-END:variables
}
