/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.Login_Business;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Login;
import view.frmTaiKhoan;
import view.frmTaiKhoan;
import view.panelHienThiChiTietDeTai;
import view.panelHienThiChiTietDeTai;
import view.panelThemMoiThongTin;
import view.panelThemMoiThongTin;
import static java.lang.Thread.sleep;

/**
 *
 * @author TKien-BKsoft
 */
public class MainFrame extends javax.swing.JFrame {

    Login objLogin_ = new Login();

    final String LINK_IMAGE = "image//HUST.PNG";

    final String LINK_IMAGE_1 = "image//123.jpg";

    boolean isLogin = false;

    boolean isAdmin = false;

    public MainFrame() {
        initComponents();

        setSize(1000, 700);

        //setSize(GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUseName = new javax.swing.JTextField();
        txtPassWord = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon(LINK_IMAGE_1);
            public void paintComponent(Graphics g) {
                Dimension d = this.getSize();
                g.drawImage(icon.getImage(),0,0,d.width,d.height,null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        jPanel1 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon(LINK_IMAGE);
            public void paintComponent(Graphics g) {
                Dimension d = this.getSize();
                g.drawImage(icon.getImage(),0,0,d.width,d.height,null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuHome = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jmenuHienThi = new javax.swing.JMenu();
        hienthiDeTai = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        btnTools = new javax.swing.JMenu();
        tool_ThemMoi = new javax.swing.JMenuItem();
        tool_TimKiem = new javax.swing.JMenuItem();
        tool_ThongKe = new javax.swing.JMenuItem();
        jmenuTaiKhoan = new javax.swing.JMenu();
        quanLyTaiKhoanNguoiDung = new javax.swing.JMenuItem();
        jmenuTroGiup = new javax.swing.JMenu();
        jMenuDangXuat = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("jMenu1");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        jMenuItem8.setText("jMenuItem8");

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("jMenu2");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Tên đăng nhập:");

        jLabel4.setText("Mật khẩu:");

        txtUseName.setText("usename");

        txtPassWord.setText("jPasswordField1");
        txtPassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassWordActionPerformed(evt);
            }
        });

        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/007.png"))); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUseName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangNhap))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangNhap))
        );

        mainPanel.setBackground(new java.awt.Color(204, 204, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Phần mềm quản lý đề tài giảng viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đại học Bách Khoa Hà Nội");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(159, 159, 159))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel.setForeground(new java.awt.Color(0, 102, 255));
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("Phần mềm quản lý đề tài đại học Bách Khoa Hà Nội");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(306, 306, 306))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setForeground(new java.awt.Color(204, 204, 204));

        jMenuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home 2.png"))); // NOI18N
        jMenuHome.setText("Home");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mailbox.gif"))); // NOI18N
        jMenuItem4.setText("Về trang chủ");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuHome.add(jMenuItem4);

        jMenuBar1.add(jMenuHome);

        jmenuHienThi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/164.png"))); // NOI18N
        jmenuHienThi.setText("Hiển thị");

        hienthiDeTai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        hienthiDeTai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/DropCap.png"))); // NOI18N
        hienthiDeTai.setText("Hiển thị thông tin các đề tài");
        hienthiDeTai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hienthiDeTaiActionPerformed(evt);
            }
        });
        jmenuHienThi.add(hienthiDeTai);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Hiển thi thông tin chuyên đề");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jmenuHienThi.add(jMenuItem5);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Hiển thị thông tin giảng viên");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jmenuHienThi.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Hiển thị thông tin theo dõi");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jmenuHienThi.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Hiển thị thông tin chi phí khác");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jmenuHienThi.add(jMenuItem11);

        jMenuBar1.add(jmenuHienThi);

        btnTools.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/settings_16.png"))); // NOI18N
        btnTools.setText("Tools");

        tool_ThemMoi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        tool_ThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/up_16.png"))); // NOI18N
        tool_ThemMoi.setText("Thêm mới");
        tool_ThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tool_ThemMoiActionPerformed(evt);
            }
        });
        btnTools.add(tool_ThemMoi);

        tool_TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/view.gif"))); // NOI18N
        tool_TimKiem.setText("Tìm kiếm");
        tool_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tool_TimKiemActionPerformed(evt);
            }
        });
        btnTools.add(tool_TimKiem);

        tool_ThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/List_BulletsHS.png"))); // NOI18N
        tool_ThongKe.setText("Thống kê");
        tool_ThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tool_ThongKeActionPerformed(evt);
            }
        });
        btnTools.add(tool_ThongKe);

        jMenuBar1.add(btnTools);

        jmenuTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Group 3.png"))); // NOI18N
        jmenuTaiKhoan.setText("Quản lý tài khoản");

        quanLyTaiKhoanNguoiDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User 7 Check.png"))); // NOI18N
        quanLyTaiKhoanNguoiDung.setText("Quản lý tài khoản người dùng");
        quanLyTaiKhoanNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanLyTaiKhoanNguoiDungActionPerformed(evt);
            }
        });
        jmenuTaiKhoan.add(quanLyTaiKhoanNguoiDung);

        jMenuBar1.add(jmenuTaiKhoan);

        jmenuTroGiup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Help-16x16.png"))); // NOI18N
        jmenuTroGiup.setText("Trợ giúp");
        jMenuBar1.add(jmenuTroGiup);

        jMenuDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        jMenuDangXuat.setText("Đăng xuất");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cal_nextMonth.gif"))); // NOI18N
        jMenuItem3.setText("Đăng xuất khỏi hệ thống");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuDangXuat.add(jMenuItem3);

        jMenuBar1.add(jMenuDangXuat);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setTitle("Phần mềm quản lý đề tài");

        hiddenButton();

        this.setLocationRelativeTo(null);

        InfoThread newThread = new InfoThread();


    }//GEN-LAST:event_formWindowOpened

    private void tool_ThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tool_ThongKeActionPerformed
        formThongKe thongKe = new formThongKe();
        thongKe.setVisible(true);
        thongKe.setLocationRelativeTo(null);
    }//GEN-LAST:event_tool_ThongKeActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed

        dangNhap();


    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void tool_ThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tool_ThemMoiActionPerformed
        // TODO add your handling code here:
        panelThemMoiThongTin pnThemMoi = new panelThemMoiThongTin();

        mainPanel.removeAll();

        mainPanel.add(pnThemMoi, BorderLayout.CENTER);

        mainPanel.updateUI();
    }//GEN-LAST:event_tool_ThemMoiActionPerformed

    private void hienthiDeTaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hienthiDeTaiActionPerformed

        panelHienThiChiTietDeTai pnHienThi = new panelHienThiChiTietDeTai();

        mainPanel.removeAll();

        mainPanel.add(pnHienThi, BorderLayout.CENTER);

        mainPanel.updateUI();
    }//GEN-LAST:event_hienthiDeTaiActionPerformed

    private void quanLyTaiKhoanNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanLyTaiKhoanNguoiDungActionPerformed
        frmTaiKhoan formTaiKhoan = new frmTaiKhoan(objLogin_);

        formTaiKhoan.setVisible(true);

        formTaiKhoan.setLocationRelativeTo(null);
    }//GEN-LAST:event_quanLyTaiKhoanNguoiDungActionPerformed

    private void txtPassWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassWordActionPerformed
        dangNhap();
    }//GEN-LAST:event_txtPassWordActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        int check = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát không", "Xác nhận", JOptionPane.YES_NO_OPTION);

        if (check == JOptionPane.YES_OPTION) {

            hiddenButton();

            txtPassWord.removeAll();

            txtUseName.setText("");

            txtPassWord.setEnabled(true);

            txtUseName.setEnabled(true);

            btnDangNhap.setEnabled(true);

        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        mainPanel.removeAll();

        mainPanel.updateUI();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void tool_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tool_TimKiemActionPerformed
        formTimKiem pnTimKiem = new formTimKiem();

        pnTimKiem.setVisible(true);
    }//GEN-LAST:event_tool_TimKiemActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        panelHienThiThongTinChuyenDe pnHienThi = new panelHienThiThongTinChuyenDe();

        mainPanel.removeAll();

        mainPanel.add(pnHienThi, BorderLayout.CENTER);

        mainPanel.updateUI();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        panelHienThiChiTietTheoDoiDeTai pnHienThi = new panelHienThiChiTietTheoDoiDeTai();

        mainPanel.removeAll();

        mainPanel.add(pnHienThi, BorderLayout.CENTER);

        mainPanel.updateUI();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        panelHienThiChiTietGiangVien pnHienThi = new panelHienThiChiTietGiangVien();

        mainPanel.removeAll();

        mainPanel.add(pnHienThi, BorderLayout.CENTER);

        mainPanel.updateUI();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        panelHienThiChiPhiKhac pnHienThi = new panelHienThiChiPhiKhac();

        mainPanel.removeAll();

        mainPanel.add(pnHienThi, BorderLayout.CENTER);

        mainPanel.updateUI();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    public void dangNhap() {
        String useName = txtUseName.getText().trim();

        String passWord = txtPassWord.getText().trim();

        Login objLogin = new Login();

        objLogin.setUseName(useName);

        objLogin.setPassWord(passWord);

        Login_Business loginB = new Login_Business();

        isLogin = loginB.isLogined(objLogin);

        isAdmin = loginB.isAdmin(objLogin);

        if (isLogin) {
            JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công");

            txtUseName.setEnabled(false);

            txtPassWord.setEnabled(false);

            btnDangNhap.setEnabled(false);

            //nạp tài khoản hiện tại vào objLogin
            objLogin_.setUseName(useName);

            objLogin_.setPassWord(passWord);

            if (!isAdmin) {
                hiddenButton_tkGV();

                objLogin_.setIsAdmin(false);
            } else {
                showAllButton();

                objLogin_.setIsAdmin(true);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Đăng nhập thất bại");
        }
    }

    public void hiddenButton() {

        jmenuHienThi.setEnabled(false);

        btnTools.setEnabled(false);

        jmenuTaiKhoan.setEnabled(false);

        jmenuTroGiup.setEnabled(false);

        jMenuDangXuat.setEnabled(false);

        jMenuHome.setEnabled(false);
    }

    public void hiddenButton_tkGV() {

        jmenuHienThi.setEnabled(false);

        jmenuTaiKhoan.setEnabled(true);

        btnTools.setEnabled(true);

        //tool_BaoCao.setEnabled(false);

        tool_ThemMoi.setEnabled(false);

        tool_ThongKe.setEnabled(false);
    }

    public void showAllButton() {

        jmenuHienThi.setEnabled(true);

        btnTools.setEnabled(true);

        jmenuTaiKhoan.setEnabled(true);

        jmenuTroGiup.setEnabled(true);

        jMenuDangXuat.setEnabled(true);

        jMenuHome.setEnabled(true);
    }

    public class InfoThread extends Thread {

        String s = jLabel.getText();

        public InfoThread() {
            start();
        }

        public void run() {
            int index = 0;
            while (true) {
                index++;
                jLabel.setText(s.substring(0, index < s.length() ? index : s.length()));
                if (index == s.length() + 20) {
                    index = 0;
                }
                try {
                    sleep(90);
                } catch (InterruptedException ex) {
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JMenu btnTools;
    private javax.swing.JMenuItem hienthiDeTai;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDangXuat;
    private javax.swing.JMenu jMenuHome;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JMenu jmenuHienThi;
    private javax.swing.JMenu jmenuTaiKhoan;
    private javax.swing.JMenu jmenuTroGiup;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem quanLyTaiKhoanNguoiDung;
    private javax.swing.JMenuItem tool_ThemMoi;
    private javax.swing.JMenuItem tool_ThongKe;
    private javax.swing.JMenuItem tool_TimKiem;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtUseName;
    // End of variables declaration//GEN-END:variables
}
