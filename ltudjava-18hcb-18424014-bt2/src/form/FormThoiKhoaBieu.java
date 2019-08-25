/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import DAO.*;
import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import POJO.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ha Chi
 */
public class FormThoiKhoaBieu extends javax.swing.JFrame {

    private final JFileChooser filesTKB;
    private String filename;

    /**
     * Creates new form FormThoiKhoaBieu
     */
    public FormThoiKhoaBieu() {
        initComponents();
        filesTKB = new JFileChooser();
        filesTKB.setCurrentDirectory(new File("C:\\Users\\Ha Chi\\Desktop"));
        filesTKB.setFileFilter(new FileNameExtensionFilter("File CSV", "csv"));
        filesTKB.setMultiSelectionEnabled(true);
        loadListLop();
        String malop = cbbMonHoc.getItemAt(1);
        loadThoiKhoaBieu(malop);
        cbbMonHoc.removeItemAt(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnThoiKhoaBieu = new javax.swing.JPanel();
        btnThoiKhoaBieu = new javax.swing.JButton();
        spThoiKhoaBieu = new javax.swing.JScrollPane();
        tblThoiKhoaBieu = new javax.swing.JTable();
        cbbMonHoc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pnThoiKhoaBieu.setBorder(javax.swing.BorderFactory.createTitledBorder("Thời Khóa Biểu"));

        btnThoiKhoaBieu.setText("Import thời khóa biểu");
        btnThoiKhoaBieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoiKhoaBieuActionPerformed(evt);
            }
        });

        tblThoiKhoaBieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        spThoiKhoaBieu.setViewportView(tblThoiKhoaBieu);

        cbbMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMonHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnThoiKhoaBieuLayout = new javax.swing.GroupLayout(pnThoiKhoaBieu);
        pnThoiKhoaBieu.setLayout(pnThoiKhoaBieuLayout);
        pnThoiKhoaBieuLayout.setHorizontalGroup(
            pnThoiKhoaBieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThoiKhoaBieuLayout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(cbbMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThoiKhoaBieu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
            .addGroup(pnThoiKhoaBieuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spThoiKhoaBieu)
                .addContainerGap())
        );
        pnThoiKhoaBieuLayout.setVerticalGroup(
            pnThoiKhoaBieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnThoiKhoaBieuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnThoiKhoaBieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbMonHoc)
                    .addComponent(btnThoiKhoaBieu, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(spThoiKhoaBieu, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnThoiKhoaBieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnThoiKhoaBieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public final void loadListLop() {
        List<ClassObjects> lst = new ClassDAO().laythongtinlop();
        cbbMonHoc.addItem("Xin mời bạn chọn lớp!");
        for (int i = 0; i < lst.size(); i++) {
            ClassObjects cl = lst.get(i);
            cbbMonHoc.addItem(cl.getMalop());
        }
    }

    public final void loadThoiKhoaBieu(String malop) {
        List<ThoiKhoaBieu> lst = new ThoiKhoaBieuDAO().layThongTinTKBTheoMaLop(malop);
        if (lst != null) {
            DefaultTableModel model = (DefaultTableModel) tblThoiKhoaBieu.getModel();
            model.setRowCount(0);
            String[] columnsName = {"STT", "Mã Môn", "Tên Môn", "Phòng Học"};
            model.setColumnIdentifiers(columnsName);
            int i = 1;
            for (ThoiKhoaBieu tkb : lst) {
                Vector row = new Vector();
                String number = Integer.toString(i);
                row.add(number);
                row.add(tkb.getMaMon());
                MonHoc mh = new MonHocDAO().laythongtinmonhoctheoID(tkb.getMaMon());
                row.add(mh.getTenMon());
                row.add(tkb.getPhongHoc());
                model.addRow(row);
                i++;
            }
            tblThoiKhoaBieu.setModel(model);
        }
    }

    public static String filename(String str, char sep, char ext) {
        String fullpath = str;
        int dot1 = fullpath.lastIndexOf(ext);
        int sep1 = fullpath.lastIndexOf(sep);
        return fullpath.substring(sep1 + 1, dot1);
    }

    private void btnThoiKhoaBieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoiKhoaBieuActionPerformed
        int returnvalue = filesTKB.showOpenDialog(this);
        if (returnvalue == JFileChooser.APPROVE_OPTION) {
            File[] files = filesTKB.getSelectedFiles();
            for (File file : files) {
                try {
                    filename = file.toString();
                    String fi = filename(filename, '\\', ' ');
                    int hocky = Integer.parseInt(filename(filename, 'K', '_'));
                    String namhoc = filename(filename, '_', '.');
                    ClassObjects cl = new ClassObjects();
                    cl.setMalop(fi);
                    new ClassDAO().themlop(cl);
                    List<String> lstimportdanhsach = new ThoiKhoaBieuDAO().layThongTinImportFileCSV(filename);
                    int size = lstimportdanhsach.size();
                    for (int i = 0; i < size; i++) {
                        String[] str = lstimportdanhsach.get(i).split(",");
                        ThoiKhoaBieu tkb = new ThoiKhoaBieu();
                        tkb.setMaLop(fi);
                        tkb.setMaMon(str[0]);
                        MonHoc mh = new MonHoc();
                        mh.setMaMon(str[0]);
                        mh.setTenMon(str[1]);
                        if(new HocKyDAO().laythongtinhockytheohocky(i) != null)
                        {
                            tkb.setHocky(hocky);
                        }
                        tkb.setNamHoc(namhoc);
                        tkb.setPhongHoc(str[2]);
                        NamHoc nh = new NamHoc();
                        nh.setManamhoc(namhoc);
                        new NamHocDAO().themnamhoc(nh);
                        new MonHocDAO().themmonhoc(mh);
                        new ThoiKhoaBieuDAO().themThoiKhoaBieu(tkb);
                        List<Student> lst = new StudentDAO().laythongtinsinhvien(fi);
                        int size1 = lst.size();
                        for(int j = 0; j < size1; j++)
                        {
                            LopMonHoc lmh = new LopMonHoc();
                            lmh.setMaLop(fi);
                            lmh.setMaMon(str[0]);
                            lmh.setStudentID(lst.get(j).getStudentid());
                            lmh.setStatus(0);
                            new LopMonHocDAO().Insert(lmh);
                        }
                    }
                    loadThoiKhoaBieu(fi);
                    cbbMonHoc.removeAllItems();
                    loadListLop();
                    cbbMonHoc.removeItemAt(0);
                    cbbMonHoc.setSelectedItem(fi);
                } catch (Exception ex) {
                    ex.getMessage();
                }
            }
        }
    }//GEN-LAST:event_btnThoiKhoaBieuActionPerformed

    private void cbbMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMonHocActionPerformed
        // TODO add your handling code here:
        filename = (String) cbbMonHoc.getSelectedItem();
        loadThoiKhoaBieu(filename);
    }//GEN-LAST:event_cbbMonHocActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoiKhoaBieu;
    private javax.swing.JComboBox<String> cbbMonHoc;
    private javax.swing.JPanel pnThoiKhoaBieu;
    private javax.swing.JScrollPane spThoiKhoaBieu;
    private javax.swing.JTable tblThoiKhoaBieu;
    // End of variables declaration//GEN-END:variables
}
