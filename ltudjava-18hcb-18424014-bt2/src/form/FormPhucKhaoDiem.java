/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;
import POJO.*;
import DAO.*;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ha Chi
 */
public class FormPhucKhaoDiem extends javax.swing.JFrame {

    /**
     * Creates new form FormPhucKhaoDiem
     */
    public FormPhucKhaoDiem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMaSSV = new javax.swing.JTextField();
        txtHoTenSV = new javax.swing.JTextField();
        txtMonThi = new javax.swing.JTextField();
        txtCotDiemCanPhucKhao = new javax.swing.JTextField();
        lblPhucKhaoDiem = new javax.swing.JLabel();
        txtDiemMongMuon = new javax.swing.JTextField();
        lblMSSV = new javax.swing.JLabel();
        txtLydo = new javax.swing.JTextField();
        lblHoTen = new javax.swing.JLabel();
        btnDangKy = new javax.swing.JButton();
        lblMonThi = new javax.swing.JLabel();
        lblCotDiem = new javax.swing.JLabel();
        lblDiemMongMuon = new javax.swing.JLabel();
        lblLido = new javax.swing.JLabel();
        lblLopMonHoc = new javax.swing.JLabel();
        cbbLopMonHoc = new javax.swing.JComboBox<>();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtMonThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonThiActionPerformed(evt);
            }
        });

        lblPhucKhaoDiem.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPhucKhaoDiem.setForeground(new java.awt.Color(51, 51, 255));
        lblPhucKhaoDiem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhucKhaoDiem.setText("PHÚC KHẢO ĐIỂM");
        lblPhucKhaoDiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblPhucKhaoDiem.setPreferredSize(new java.awt.Dimension(200, 42));

        lblMSSV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMSSV.setText("Mã số sinh viên: ");

        lblHoTen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblHoTen.setText("Họ tên sinh viên:");

        btnDangKy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDangKy.setText("Đăng ký phúc khảo điểm");
        btnDangKy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDangKy.setBorderPainted(false);
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        lblMonThi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMonThi.setText("Môn thi: ");

        lblCotDiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblCotDiem.setText("Cột điểm cần phúc khảo:");

        lblDiemMongMuon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDiemMongMuon.setText("Điểm mong muốn:");

        lblLido.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLido.setText("Lý do rõ ràng, cụ thể:");

        lblLopMonHoc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLopMonHoc.setText("Mã lớp môn học:");

        cbbLopMonHoc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPhucKhaoDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblLopMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(lblMSSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMonThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCotDiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDiemMongMuon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCotDiemCanPhucKhao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaSSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(txtHoTenSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(txtMonThi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(txtDiemMongMuon)
                            .addComponent(txtLydo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(cbbLopMonHoc, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPhucKhaoDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMaSSV, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMonThi, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(txtMonThi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLopMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbLopMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCotDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCotDiemCanPhucKhao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiemMongMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiemMongMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLydo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        PhucKhaoDiem pkd = new PhucKhaoDiem();
        pkd.setStudentId(txtMaSSV.getText());
        MonHoc mh = new MonHocDAO().layThongTinMonHoctheotenmonhoc(txtMonThi.getText());
        pkd.setMaMon(mh.getMaMon());
        String lopmonhoc = (String)cbbLopMonHoc.getSelectedItem();
        String[] malop = lopmonhoc.split("-");
        pkd.setMaLop(malop[0]);
        pkd.setCotDiemCanPhucKhao(txtCotDiemCanPhucKhao.getText());
        pkd.setDiemMongMuon(Integer.parseInt(txtDiemMongMuon.getText()));
        pkd.setLiDo(txtLydo.getText());
        long milis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(milis);
        pkd.setNgayDangKy(date);
        pkd.setIdTinhTrang(1);
        boolean kq = new PhucKhaoDiemDAO().themphuckhaodiem(pkd);
        if(kq == true)
        {
            JOptionPane.showMessageDialog(this, "Ban da dang ky thanh cong");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Ban da dang ky khong thanh cong");
        }
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void txtMonThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonThiActionPerformed
        cbbLopMonHoc.removeAllItems();
        MonHoc su = new MonHocDAO().layThongTinMonHoctheotenmonhoc(txtMonThi.getText());
        List<ThoiKhoaBieu> lst = new ThoiKhoaBieuDAO().layThongTinTKBTheoMaMon(su.getMaMon());
        lst.forEach((sc) -> {
            cbbLopMonHoc.addItem(sc.getMaLop() + '-' + sc.getMaMon());
        });
    }//GEN-LAST:event_txtMonThiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cbbLopMonHoc;
    private javax.swing.JLabel lblCotDiem;
    private javax.swing.JLabel lblDiemMongMuon;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblLido;
    private javax.swing.JLabel lblLopMonHoc;
    private javax.swing.JLabel lblMSSV;
    private javax.swing.JLabel lblMonThi;
    private javax.swing.JLabel lblPhucKhaoDiem;
    private javax.swing.JTextField txtCotDiemCanPhucKhao;
    private javax.swing.JTextField txtDiemMongMuon;
    private javax.swing.JTextField txtHoTenSV;
    private javax.swing.JTextField txtLydo;
    private javax.swing.JTextField txtMaSSV;
    private javax.swing.JTextField txtMonThi;
    // End of variables declaration//GEN-END:variables
}
