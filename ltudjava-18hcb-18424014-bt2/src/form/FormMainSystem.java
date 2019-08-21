/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author Ha Chi
 */
public class FormMainSystem extends javax.swing.JFrame {

    private final String user;

    /**
     * Creates new form FormMainSystem
     *
     * @param username
     */
    public FormMainSystem(String username) {
        initComponents();
        user = username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        pnThongTinChung = new javax.swing.JPanel();
        btnChangePassword = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnXemDiem = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();
        pnChucNang = new javax.swing.JPanel();
        btnDanhSachLop = new javax.swing.JButton();
        btnThoiKhoaBieu = new javax.swing.JButton();
        btnDiem = new javax.swing.JButton();
        btnLopMonHoc = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnThongTinChung.setBorder(javax.swing.BorderFactory.createTitledBorder("Trang chủ"));
        pnThongTinChung.setName(""); // NOI18N

        btnChangePassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnChangePassword.setText("Đổi Mật Khẩu");
        btnChangePassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnChangePassword.setFocusPainted(false);
        btnChangePassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChangePassword.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        btnDangXuat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDangXuat.setFocusPainted(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnXemDiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXemDiem.setText("Xem Điểm Sinh Viên");
        btnXemDiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXemDiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXemDiem.setOpaque(false);
        btnXemDiem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXemDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemDiemActionPerformed(evt);
            }
        });

        btnDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDangNhap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangNhap.setOpaque(false);
        btnDangNhap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnThongTinChungLayout = new javax.swing.GroupLayout(pnThongTinChung);
        pnThongTinChung.setLayout(pnThongTinChungLayout);
        pnThongTinChungLayout.setHorizontalGroup(
            pnThongTinChungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinChungLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXemDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnThongTinChungLayout.setVerticalGroup(
            pnThongTinChungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinChungLayout.createSequentialGroup()
                .addGroup(pnThongTinChungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(btnXemDiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChangePassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnChucNang.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        btnDanhSachLop.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDanhSachLop.setText("Danh Sách Lớp");
        btnDanhSachLop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDanhSachLop.setFocusPainted(false);
        btnDanhSachLop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDanhSachLop.setMaximumSize(new java.awt.Dimension(70, 75));
        btnDanhSachLop.setMinimumSize(new java.awt.Dimension(70, 73));
        btnDanhSachLop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDanhSachLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachLopActionPerformed(evt);
            }
        });

        btnThoiKhoaBieu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThoiKhoaBieu.setText("Thời Khóa Biểu");
        btnThoiKhoaBieu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThoiKhoaBieu.setFocusPainted(false);
        btnThoiKhoaBieu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThoiKhoaBieu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThoiKhoaBieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoiKhoaBieuActionPerformed(evt);
            }
        });

        btnDiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDiem.setText("Điểm");
        btnDiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDiem.setFocusPainted(false);
        btnDiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiemActionPerformed(evt);
            }
        });

        btnLopMonHoc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLopMonHoc.setText("Danh Sách Lớp Theo Môn Học");
        btnLopMonHoc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLopMonHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLopMonHoc.setOpaque(false);
        btnLopMonHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLopMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLopMonHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnChucNangLayout = new javax.swing.GroupLayout(pnChucNang);
        pnChucNang.setLayout(pnChucNangLayout);
        pnChucNangLayout.setHorizontalGroup(
            pnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDanhSachLop, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoiKhoaBieu, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLopMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnChucNangLayout.setVerticalGroup(
            pnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChucNangLayout.createSequentialGroup()
                .addGroup(pnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDanhSachLop, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoiKhoaBieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLopMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThoat.setFocusPainted(false);
        btnThoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThoat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane2.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnThongTinChung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(pnChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addComponent(jDesktopPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnChucNang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnThongTinChung, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDesktopPane2)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        FromChangePassword cp = new FromChangePassword(user);
        jDesktopPane2.removeAll();
        cp.setVisible(true);
        jDesktopPane2.add(cp);
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed

    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnXemDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemDiemActionPerformed

    }//GEN-LAST:event_btnXemDiemActionPerformed

    private void btnDanhSachLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachLopActionPerformed
        FormStudent st = new FormStudent();
        st.setVisible(true);
    }//GEN-LAST:event_btnDanhSachLopActionPerformed

    private void btnThoiKhoaBieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoiKhoaBieuActionPerformed
        FormThoiKhoaBieu tkb = new FormThoiKhoaBieu();
        tkb.setVisible(true);
    }//GEN-LAST:event_btnThoiKhoaBieuActionPerformed

    private void btnDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiemActionPerformed

    }//GEN-LAST:event_btnDiemActionPerformed

    private void btnLopMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLopMonHocActionPerformed

    }//GEN-LAST:event_btnLopMonHocActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDanhSachLop;
    private javax.swing.JButton btnDiem;
    private javax.swing.JButton btnLopMonHoc;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThoiKhoaBieu;
    private javax.swing.JButton btnXemDiem;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JPanel pnChucNang;
    private javax.swing.JPanel pnThongTinChung;
    // End of variables declaration//GEN-END:variables
}
