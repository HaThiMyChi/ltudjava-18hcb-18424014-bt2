/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;
import POJO.*;
import DAO.*;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPhucKhaoDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMSSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMonThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCotDiem, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(lblDiemMongMuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCotDiemCanPhucKhao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaSSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(txtHoTenSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(txtMonThi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(txtDiemMongMuon)
                            .addComponent(txtLydo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCotDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCotDiemCanPhucKhao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDiemMongMuon, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(txtDiemMongMuon))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLydo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        PhucKhaoDiem pkd = new PhucKhaoDiem();
        pkd.setStudentid(txtMaSSV.getText());
        MonHoc mh = new MonHocDAO().layThongTinMonHoctheotenmonhoc(txtMonThi.getText());
        pkd.setMamon(mh.getMaMon());
        pkd.setCotdiemcanphuckhao(txtCotDiemCanPhucKhao.getText());
        pkd.setDiemmongmuon(Integer.parseInt(txtDiemMongMuon.getText()));
        pkd.setLido(txtLydo.getText());
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
            java.util.logging.Logger.getLogger(FormPhucKhaoDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPhucKhaoDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPhucKhaoDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPhucKhaoDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPhucKhaoDiem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JLabel lblCotDiem;
    private javax.swing.JLabel lblDiemMongMuon;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblLido;
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
