/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import POJO.*;
import DAO.*;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ha Chi
 */
public class FormDangKyMonHoc extends javax.swing.JFrame {

    private String MSSV;

    /**
     * Creates new form FormDangKyMonHoc
     */
    public FormDangKyMonHoc() {
        initComponents();
        LopMonHoc();
        Lop();
        MonHoc();
    }

    public final void LopMonHoc() {
        List<ThoiKhoaBieu> lst = new ThoiKhoaBieuDAO().layThongTinThoiKhoaBieu();
        lst.forEach((lop) -> {
            cbxLopMonHoc.addItem(lop.getMaLop() + '-' + lop.getMaMon());
        });
    }

    public final void Lop() {
        List<ClassObjects> lst = new ClassDAO().laythongtinlop();
        lst.forEach((lop) -> {
            cbxLop.addItem(lop.getMalop());
        });
    }

    public final void MonHoc() {
        List<MonHoc> lst = new MonHocDAO().layThongTinMonHoc();
        lst.forEach((su) -> {
            cbxMonHoc.addItem(su.getTenMon());
        });
    }

    public void LoadLopMonHoc(String malop, String mamon) {
        List<LopMonHoc> lst = new LopMonHocDAO().laythongtintheomalopvamamon(malop, mamon);
        if (lst.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không có dữ liệu");
        }
        DefaultTableModel model = (DefaultTableModel) tblDanhSachLopMonHoc.getModel();
        model.setRowCount(0);
        String[] columnsName = {"STT", "MSSV", "Họ tên", "Giới tính", "CMND"};
        model.setColumnIdentifiers(columnsName);
        int i = 1;
        for (LopMonHoc lmh : lst) {
            Vector row = new Vector();
            String number = Integer.toString(i);
            row.add(number);
            Student st = new StudentDAO().laythongtinsinhvientheoID(lmh.getStudentID());
            row.add(st.getStudentid());
            row.add(st.getFullname());
            if (st.getSex() == 0) {
                row.add("Nam");
            } else {
                row.add("Nữ");
            }
            row.add(st.getIdentitycard());
            model.addRow(row);
            i++;
        }
        tblDanhSachLopMonHoc.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnThongTin = new javax.swing.JPanel();
        lblthongtin = new javax.swing.JLabel();
        lblMSSV = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        lblHoTen = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        lblLop = new javax.swing.JLabel();
        cbxLop = new javax.swing.JComboBox<>();
        lblMonHoc = new javax.swing.JLabel();
        cbxMonHoc = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnNhapLai = new javax.swing.JButton();
        lblHocKy = new javax.swing.JLabel();
        radioChinh = new javax.swing.JRadioButton();
        radioTraNo = new javax.swing.JRadioButton();
        lblLopMonHoc = new javax.swing.JLabel();
        cbxMaLopMonHoc = new javax.swing.JComboBox<>();
        radioHocLai = new javax.swing.JRadioButton();
        pnDanhSach = new javax.swing.JPanel();
        cbxLopMonHoc = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachLopMonHoc = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnThongTin.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Sinh Viên"));

        lblthongtin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblthongtin.setForeground(new java.awt.Color(0, 51, 255));
        lblthongtin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblthongtin.setText("THÔNG TIN SINH VIÊN ĐĂNG KÝ MÔN HỌC");

        lblMSSV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMSSV.setText("Mã Số Sinh Viên:");

        txtMSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSSVActionPerformed(evt);
            }
        });

        lblHoTen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblHoTen.setText("Họ Tên Sinh Viên:");

        lblLop.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLop.setText(" Lớp: ");

        cbxLop.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbxLop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblMonHoc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMonHoc.setText("Môn Học:");

        cbxMonHoc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbxMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMonHocActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("Lưu");
        btnSave.setBorderPainted(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnNhapLai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnNhapLai.setText("Nhập lại");
        btnNhapLai.setBorderPainted(false);
        btnNhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapLaiActionPerformed(evt);
            }
        });

        lblHocKy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblHocKy.setText("Học Kỳ:");

        radioChinh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioChinh.setText(" Chính");
        radioChinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        radioTraNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioTraNo.setText("Trả nợ");
        radioTraNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblLopMonHoc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLopMonHoc.setText("Mã Lớp Môn Học: ");

        cbxMaLopMonHoc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbxMaLopMonHoc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        radioHocLai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radioHocLai.setText("Học lại");
        radioHocLai.setHideActionText(true);
        radioHocLai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        radioHocLai.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnThongTinLayout = new javax.swing.GroupLayout(pnThongTin);
        pnThongTin.setLayout(pnThongTinLayout);
        pnThongTinLayout.setHorizontalGroup(
            pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinLayout.createSequentialGroup()
                .addComponent(lblthongtin, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(pnThongTinLayout.createSequentialGroup()
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnThongTinLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnThongTinLayout.createSequentialGroup()
                                .addComponent(lblHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radioChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radioTraNo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(radioHocLai, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnThongTinLayout.createSequentialGroup()
                                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblLopMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblLop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHoTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(lblMSSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMonHoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnThongTinLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnThongTinLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtMSSV, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                                    .addComponent(txtHoTen)))
                                            .addComponent(cbxMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxLop, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnThongTinLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(cbxMaLopMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(pnThongTinLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(btnNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnThongTinLayout.setVerticalGroup(
            pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinLayout.createSequentialGroup()
                .addComponent(lblthongtin, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxLop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxMaLopMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLopMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHocKy, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioTraNo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioHocLai, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pnDanhSach.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách Sinh Viên"));

        cbxLopMonHoc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbxLopMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLopMonHocActionPerformed(evt);
            }
        });

        tblDanhSachLopMonHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDanhSachLopMonHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachLopMonHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSachLopMonHoc);

        btnDelete.setText("Xóa Sinh Viên");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.setActionCommand("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDanhSachLayout = new javax.swing.GroupLayout(pnDanhSach);
        pnDanhSach.setLayout(pnDanhSachLayout);
        pnDanhSachLayout.setHorizontalGroup(
            pnDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDanhSachLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(cbxLopMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(pnDanhSachLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        pnDanhSachLayout.setVerticalGroup(
            pnDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDanhSachLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxLopMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(pnDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMonHocActionPerformed
        cbxMaLopMonHoc.removeAllItems();
        String monhoc = (String) cbxMonHoc.getSelectedItem();
        MonHoc su = new MonHocDAO().layThongTinMonHoctheotenmonhoc(monhoc);
        List<ThoiKhoaBieu> lst = new ThoiKhoaBieuDAO().layThongTinTKBTheoMaMon(su.getMaMon());
        int size = lst.size();
        for (int i = 0; i < size; i++) {
            cbxMaLopMonHoc.addItem(lst.get(i).getMaLop() + "-" + lst.get(i).getMaMon());
        }
    }//GEN-LAST:event_cbxMonHocActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String malopmonhoc = (String) cbxMaLopMonHoc.getSelectedItem();
        String[] lopmonhoc = malopmonhoc.split("-");
        LopMonHoc lmh = new LopMonHoc();
        lmh.setMaLop(lopmonhoc[0]);
        lmh.setMaMon(lopmonhoc[1]);
        lmh.setStudentID(txtMSSV.getText());
        if (radioChinh.isSelected()) {
            lmh.setStatus(0);
        } else {
            if (radioTraNo.isSelected()) {
                lmh.setStatus(1);
            } else {
                if (radioHocLai.isSelected()) {
                    lmh.setStatus(1);
                }
            }
        }
        boolean KQ = new LopMonHocDAO().Insert(lmh);
        if (KQ == true) {
            JOptionPane.showMessageDialog(this, "Bạn đã đăng ký thành công");
            LoadLopMonHoc(lopmonhoc[0], lopmonhoc[1]);
            cbxLopMonHoc.setSelectedItem(lopmonhoc[0] + "-" + lopmonhoc[1]);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn đã đăng ký không thành công");
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNhapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapLaiActionPerformed
        // TODO add your handling code here:
        txtMSSV.setText("");
        txtHoTen.setText("");
    }//GEN-LAST:event_btnNhapLaiActionPerformed

    private void cbxLopMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLopMonHocActionPerformed
        String lopmonhoc = (String) cbxLopMonHoc.getSelectedItem();
        String[] lmh = lopmonhoc.split("-");
        LoadLopMonHoc(lmh[0], lmh[1]);
    }//GEN-LAST:event_cbxLopMonHocActionPerformed

    private void tblDanhSachLopMonHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachLopMonHocMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblDanhSachLopMonHoc.getModel();
        int selectedRowIndex = tblDanhSachLopMonHoc.getSelectedRow();
        MSSV = (String) model.getValueAt(selectedRowIndex, 1);
    }//GEN-LAST:event_tblDanhSachLopMonHocMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblDanhSachLopMonHoc.getModel();
        int selectedRowIndex = tblDanhSachLopMonHoc.getSelectedRow();
        MSSV = (String) model.getValueAt(selectedRowIndex, 1);
        String malopmonhoc = (String) cbxLopMonHoc.getSelectedItem();
        String[] lopmonhoc = malopmonhoc.split("-");
        boolean KQ = new LopMonHocDAO().Delete(lopmonhoc[0], lopmonhoc[1], MSSV);
        if (KQ == true) {
            JOptionPane.showMessageDialog(this, "Bạn đã xóa thành công");
            LoadLopMonHoc(lopmonhoc[0], lopmonhoc[1]);
            cbxLopMonHoc.setSelectedItem(lopmonhoc[0] + "-" + lopmonhoc[1]);
        } else {
            JOptionPane.showMessageDialog(this, "Bạn đã xóa không thành công");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtMSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSSVActionPerformed
        Student st = new StudentDAO().laythongtinsinhvientheoID(txtMSSV.getText());
        txtHoTen.setText(st.getFullname());
        cbxLop.setSelectedItem(st.getMalop());
    }//GEN-LAST:event_txtMSSVActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNhapLai;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cbxLop;
    private javax.swing.JComboBox<String> cbxLopMonHoc;
    private javax.swing.JComboBox<String> cbxMaLopMonHoc;
    private javax.swing.JComboBox<String> cbxMonHoc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblHocKy;
    private javax.swing.JLabel lblLop;
    private javax.swing.JLabel lblLopMonHoc;
    private javax.swing.JLabel lblMSSV;
    private javax.swing.JLabel lblMonHoc;
    private javax.swing.JLabel lblthongtin;
    private javax.swing.JPanel pnDanhSach;
    private javax.swing.JPanel pnThongTin;
    private javax.swing.JRadioButton radioChinh;
    private javax.swing.JRadioButton radioHocLai;
    private javax.swing.JRadioButton radioTraNo;
    private javax.swing.JTable tblDanhSachLopMonHoc;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMSSV;
    // End of variables declaration//GEN-END:variables
}
