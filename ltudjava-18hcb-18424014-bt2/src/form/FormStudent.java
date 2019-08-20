/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import DAO.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import POJO.*;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Ha Chi
 */
public class FormStudent extends javax.swing.JFrame {

    private final JFileChooser filestudent;
    private String filename;

    /**
     * Creates new form FormStudent
     */
    public FormStudent() {
        initComponents();
        filestudent = new JFileChooser();
        filestudent.setCurrentDirectory(new File("C:\\Users\\Ha Chi\\Desktop"));
        filestudent.setFileFilter(new FileNameExtensionFilter("File CSV", "csv"));
        filestudent.setMultiSelectionEnabled(true);
        Loadlistlop();
        Loadlistlopcuasinhvien();
        String malop = cbxLop.getItemAt(1);
        LoadSinhvien(malop);
        cbxLop.removeItemAt(0);
    }

    public final void Loadlistlop() {
        List<ClassObjects> lst = new ClassDAO().laythongtinlop();
        cbxLop.addItem("Bạn hãy chọn lớp");
        for (int i = 0; i < lst.size(); i++) {
            ClassObjects cl = lst.get(i);
            cbxLop.addItem(cl.getMalop());
        }
    }

    public final void Loadlistlopcuasinhvien() {
        List<ClassObjects> lst = new ClassDAO().laythongtinlop();
        for (int i = 0; i < lst.size(); i++) {
            ClassObjects cl = lst.get(i);
            cbbLop.addItem(cl.getMalop());
        }
    }

    @SuppressWarnings("unchecked")
    public final void LoadSinhvien(String malop) {
        List<Student> lst = new StudentDAO().laythongtinsinhvien(malop);
        if (lst != null) {
            DefaultTableModel model = (DefaultTableModel) tblDanhSach.getModel();
            model.setRowCount(0);
            String[] columnsName = {"STT", "MSSV", "Họ tên", "Giới tính", "CMND"};
            model.setColumnIdentifiers(columnsName);
            int i = 1;
            for (Student st : lst) {
                Vector row = new Vector();
                String number = Integer.toString(i);
                row.add(number);
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
            tblDanhSach.setModel(model);
        } else {
            DefaultTableModel model = (DefaultTableModel) tblDanhSach.getModel();
            model.setRowCount(0);
            String[] columnsName = {"STT", "MSSV", "Họ tên", "Giới tính", "CMND"};
            model.setColumnIdentifiers(columnsName);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnChitietSinhVien = new javax.swing.JPanel();
        lblMSSV = new javax.swing.JLabel();
        lblThongTinSinhVien = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        lblCMND = new javax.swing.JLabel();
        txtCMND = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbbLop = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        pnDanhSachSinhVien = new javax.swing.JPanel();
        spDanhSach = new javax.swing.JScrollPane();
        tblDanhSach = new javax.swing.JTable();
        btnDanhSachLop = new javax.swing.JButton();
        cbxLop = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnChitietSinhVien.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi Tiết Sinh Viên"));
        pnChitietSinhVien.setName("Chi Tiết Sinh Viên"); // NOI18N
        pnChitietSinhVien.setOpaque(false);

        lblMSSV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMSSV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMSSV.setText("Mã Số Sinh Viên:");

        lblThongTinSinhVien.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblThongTinSinhVien.setForeground(new java.awt.Color(51, 51, 255));
        lblThongTinSinhVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongTinSinhVien.setText("THÔNG TIN SINH VIÊN");

        lblGioiTinh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblGioiTinh.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGioiTinh.setText("Giới Tính:");

        lblHoTen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblHoTen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHoTen.setText("Họ Tên Sinh Viên:");

        radNam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radNam.setText("Nam");
        radNam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        radNam.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        radNu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        radNu.setText("Nữ");
        radNu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        radNu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblCMND.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblCMND.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCMND.setText("CMND:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Lớp:");

        cbbLop.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.setBorderPainted(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.setBorderPainted(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        pnDanhSachSinhVien.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách Sinh Viên"));

        tblDanhSach.setAutoCreateRowSorter(true);
        tblDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDanhSach.setOpaque(false);
        spDanhSach.setViewportView(tblDanhSach);

        btnDanhSachLop.setText("Import Danh Sách Lớp");
        btnDanhSachLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachLopActionPerformed(evt);
            }
        });

        cbxLop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxLop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxLopItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnDanhSachSinhVienLayout = new javax.swing.GroupLayout(pnDanhSachSinhVien);
        pnDanhSachSinhVien.setLayout(pnDanhSachSinhVienLayout);
        pnDanhSachSinhVienLayout.setHorizontalGroup(
            pnDanhSachSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDanhSachSinhVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDanhSachSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnDanhSachSinhVienLayout.createSequentialGroup()
                        .addComponent(cbxLop, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDanhSachLop, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnDanhSachSinhVienLayout.setVerticalGroup(
            pnDanhSachSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDanhSachSinhVienLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnDanhSachSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDanhSachLop, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(cbxLop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spDanhSach, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnChitietSinhVienLayout = new javax.swing.GroupLayout(pnChitietSinhVien);
        pnChitietSinhVien.setLayout(pnChitietSinhVienLayout);
        pnChitietSinhVienLayout.setHorizontalGroup(
            pnChitietSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChitietSinhVienLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnChitietSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnChitietSinhVienLayout.createSequentialGroup()
                        .addGroup(pnChitietSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnChitietSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnChitietSinhVienLayout.createSequentialGroup()
                                .addComponent(radNam, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(radNu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnChitietSinhVienLayout.createSequentialGroup()
                                .addGroup(pnChitietSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHoTen)
                                    .addComponent(txtCMND)
                                    .addComponent(cbbLop, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(495, 495, 495))))
                    .addGroup(pnChitietSinhVienLayout.createSequentialGroup()
                        .addComponent(lblMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(pnChitietSinhVienLayout.createSequentialGroup()
                .addGap(443, 443, 443)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnChitietSinhVienLayout.createSequentialGroup()
                .addGroup(pnChitietSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnChitietSinhVienLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnDanhSachSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnChitietSinhVienLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(lblThongTinSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnChitietSinhVienLayout.setVerticalGroup(
            pnChitietSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChitietSinhVienLayout.createSequentialGroup()
                .addComponent(lblThongTinSinhVien)
                .addGap(38, 38, 38)
                .addGroup(pnChitietSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMSSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnChitietSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnChitietSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radNam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radNu))
                .addGap(18, 18, 18)
                .addGroup(pnChitietSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnChitietSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbLop, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(pnChitietSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnDanhSachSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnChitietSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnChitietSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Student st = new Student();
        st.setStudentid(txtMSSV.getText());
        st.setFullname(txtHoTen.getText());
        if (radNam.isSelected()) {
            st.setSex((short) 0);
        } else {
            st.setSex((short) 1);
        }
        st.setIdentitycard(txtCMND.getText());
        st.setMalop((String) cbbLop.getSelectedItem());
        boolean KQ = new StudentDAO().themsinhvien(st);
        User us = new User();
        us.setUsername(txtMSSV.getText());
        us.setPassword(txtMSSV.getText());
        us.setPassword(txtMSSV.getText());
        new UserDAO().themuser(us);
        if (KQ == true) {
            JOptionPane.showMessageDialog(this, "Bạn đã nhập thành công");
            LoadSinhvien((String) cbbLop.getSelectedItem());
            cbxLop.setSelectedItem((String) cbbLop.getSelectedItem());
        } else {
            JOptionPane.showMessageDialog(this, "Bạn đã nhập không thành công");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    public static String filename(String str, char sep, char ext) {
        String fullpath = str;
        int dot1 = fullpath.lastIndexOf(ext);
        int sep1 = fullpath.lastIndexOf(sep);
        return fullpath.substring(sep1 + 1, dot1);
    }

    private void btnDanhSachLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachLopActionPerformed
        int returnvalue = filestudent.showOpenDialog(this);
        if (returnvalue == JFileChooser.APPROVE_OPTION) {
            File[] files = filestudent.getSelectedFiles();
            for (File file : files) {
                try {
                    filename = file.toString();
                    String fi = filename(filename, '\\', '.');
                    ClassObjects cl = new ClassObjects();
                    cl.setMalop(fi);
                    new ClassDAO().themlop(cl);
                    List<String> lstimportdanhsach = new StudentDAO().laythongtinimportfilecsv(filename);
                    int size = lstimportdanhsach.size();
                    for (int i = 0; i < size; i++) {
                        String[] str = lstimportdanhsach.get(i).split(",");
                        Student st = new Student();
                        st.setStudentid(str[0]);
                        st.setFullname(str[1]);
                        st.setSex(Short.parseShort(str[2]));
                        st.setIdentitycard(str[3]);
                        st.setMalop(fi);
                        List<User> lst = new UserDAO().laythongtinuser();
                        User us = new User();
                        us.setUsername(str[0]);
                        us.setPassword(str[0]);
                        us.setStudentID(str[0]);
                        new StudentDAO().themsinhvien(st);
                        new UserDAO().themuser(us);
                    }
                    LoadSinhvien(fi);
                    cbbLop.removeAllItems();
                    cbxLop.removeAllItems();
                    Loadlistlop();
                    Loadlistlopcuasinhvien();
                    cbxLop.removeItemAt(0);
                    cbxLop.setSelectedItem(fi);
                } catch (IOException | NumberFormatException ex) {
                    ex.getMessage();
                }
            }
        }
    }//GEN-LAST:event_btnDanhSachLopActionPerformed

    private void cbxLopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxLopItemStateChanged
        filename = (String) cbxLop.getSelectedItem();
        LoadSinhvien(filename);
    }//GEN-LAST:event_cbxLopItemStateChanged

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        System.exit((0));
    }//GEN-LAST:event_btnCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDanhSachLop;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbbLop;
    private javax.swing.JComboBox<String> cbxLop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCMND;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMSSV;
    private javax.swing.JLabel lblThongTinSinhVien;
    private javax.swing.JPanel pnChitietSinhVien;
    private javax.swing.JPanel pnDanhSachSinhVien;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JScrollPane spDanhSach;
    private javax.swing.JTable tblDanhSach;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMSSV;
    // End of variables declaration//GEN-END:variables
}
