/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import DAO.*;
import POJO.*;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ha Chi
 */
public class FormXemDiemSinhVien extends javax.swing.JFrame {

    private String username;

    /**
     * Creates new form FormXemDiemSinhVien
     *
     * @param user
     */
    public FormXemDiemSinhVien(String user) {
        initComponents();
        username = user;
        LoadHocKy();
        LoadNamHoc();
        btnPhucKhaoDiem.setVisible(false);
        List<LichPhucKhao> lst = new LichPhucKhaoDAO().laythongtin();
        SimpleDateFormat dt1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dt2 = new SimpleDateFormat("dd/MM/yyyy");
        lst.forEach((exp) -> {
            if (exp.getNgayBatDau() != null && exp.getNgayKetThuc() != null) {
                lblthongbao.setText("Thời gian phúc khảo từ ngày " + dt1.format(exp.getNgayBatDau()) + " đến ngày " + dt2.format(exp.getNgayKetThuc()));
            }
        });
    }

    private void LoadHocKy() {
        List<HocKy> lst = new HocKyDAO().laythongtinhocky();
        lst.forEach((hk) -> {
            cbblop5.addItem(String.valueOf(hk.getMahocky()));
        });
    }

    private void LoadNamHoc() {
        List<NamHoc> lst = new NamHocDAO().laythongtinnamhoc();
        lst.forEach((nh) -> {
            cbblop4.addItem(nh.getManamhoc());
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbblop4 = new javax.swing.JComboBox<>();
        lblHoTen2 = new javax.swing.JLabel();
        cbblop5 = new javax.swing.JComboBox<>();
        btnXemDiem1 = new javax.swing.JButton();
        lblHoTen1 = new javax.swing.JLabel();
        lblthongbao = new javax.swing.JLabel();
        btnPhucKhaoDiem = new javax.swing.JButton();
        pnDanhSachSinhVien = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangDiem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cbblop4.setBackground(new java.awt.Color(204, 204, 204));
        cbblop4.setEditable(true);
        cbblop4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblHoTen2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblHoTen2.setText("Học kỳ:");

        cbblop5.setBackground(new java.awt.Color(204, 204, 204));
        cbblop5.setEditable(true);
        cbblop5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnXemDiem1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXemDiem1.setText("Xem kết quả học tập");
        btnXemDiem1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXemDiem1.setBorderPainted(false);
        btnXemDiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemDiem1ActionPerformed(evt);
            }
        });

        lblHoTen1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblHoTen1.setText("Năm học:");

        lblthongbao.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        btnPhucKhaoDiem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPhucKhaoDiem.setText("Phúc khảo điểm");
        btnPhucKhaoDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhucKhaoDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHoTen1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbblop4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(lblHoTen2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbblop5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblthongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXemDiem1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(btnPhucKhaoDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoTen2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbblop5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXemDiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoTen1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbblop4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblthongbao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPhucKhaoDiem, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnDanhSachSinhVien.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách kết quả học tập"));

        tblBangDiem.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblBangDiem);

        javax.swing.GroupLayout pnDanhSachSinhVienLayout = new javax.swing.GroupLayout(pnDanhSachSinhVien);
        pnDanhSachSinhVien.setLayout(pnDanhSachSinhVienLayout);
        pnDanhSachSinhVienLayout.setHorizontalGroup(
            pnDanhSachSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDanhSachSinhVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnDanhSachSinhVienLayout.setVerticalGroup(
            pnDanhSachSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDanhSachSinhVienLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnDanhSachSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pnDanhSachSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXemDiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemDiem1ActionPerformed
        int hocky = Integer.parseInt(cbblop5.getSelectedItem().toString());
        String namhoc = cbblop4.getSelectedItem().toString();
        List<ThoiKhoaBieu> lsttkb = new ThoiKhoaBieuDAO().layThongTinTKBTheoHocKyVaNamHoc(hocky, namhoc);
        int size = lsttkb.size();
        for (int i = 0; i < size; i++) {
            BangDiem bd = new BangDiemDAO().layTheoMaLopMaMonAndStudentID(lsttkb.get(i).getMaLop(), lsttkb.get(i).getMaMon(), username);
            if (bd != null) {
                DefaultTableModel model = (DefaultTableModel) tblBangDiem.getModel();
                model.setRowCount(0);
                String[] columnsName = {"MSSV", "Họ Tên", "Môn thi", "Điểm Giữa kỳ", "Điểm Cuối kỳ", "Điểm Khác", "Điểm Tổng Kết", "Kết Quả"};
                model.setColumnIdentifiers(columnsName);
                Vector row = new Vector();
                row.add(bd.getStudentID());
                Student st = new StudentDAO().laythongtinsinhvientheoID(bd.getStudentID());
                row.add(st.getFullname());
                MonHoc mh = new MonHocDAO().laythongtinmonhoctheoID(bd.getMaMon());
                row.add(mh.getTenMon());
                row.add(bd.getDiemGK());
                row.add(bd.getDiemCK());
                row.add(bd.getDiemKhac());
                row.add(bd.getDiemTong());
                String KQ;
                if (bd.getDiemTong() < 5) {
                    KQ = "Rớt";
                } else {
                    KQ = "Đậu";
                }
                row.add(KQ);
                model.addRow(row);
            }
        }
        List<LichPhucKhao> lst = new LichPhucKhaoDAO().laythongtin();
        lst.forEach((exp) -> {
            if (exp.getNgayBatDau() != null && exp.getNgayKetThuc() != null) {
                long milis = System.currentTimeMillis();
                java.util.Date date = new java.sql.Date(milis);
                if (exp.getNgayKetThuc().compareTo(date) > 0) {
                    btnPhucKhaoDiem.setVisible(true);
                } else {
                    btnPhucKhaoDiem.setVisible(false);
                }
            }
        });
    }//GEN-LAST:event_btnXemDiem1ActionPerformed

    private void btnPhucKhaoDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhucKhaoDiemActionPerformed
        FormPhucKhaoDiem pkd = new FormPhucKhaoDiem();
        pkd.setVisible(true);
    }//GEN-LAST:event_btnPhucKhaoDiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPhucKhaoDiem;
    private javax.swing.JButton btnXemDiem1;
    private javax.swing.JComboBox<String> cbblop4;
    private javax.swing.JComboBox<String> cbblop5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHoTen1;
    private javax.swing.JLabel lblHoTen2;
    private javax.swing.JLabel lblthongbao;
    private javax.swing.JPanel pnDanhSachSinhVien;
    private javax.swing.JTable tblBangDiem;
    // End of variables declaration//GEN-END:variables
}
