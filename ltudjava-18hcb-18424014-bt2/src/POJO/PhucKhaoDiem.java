/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.io.*;
import java.util.Date;

/**
 *
 * @author Ha Chi
 */
public class PhucKhaoDiem implements Serializable {

    private static final long serialVersionUID = 1L;
    private String studentId;
    private String maLop;
    private String maMon;
    private String cotDiemCanPhucKhao;
    private float DiemMongMuon;
    private String liDo;
    private Date ngayDangKy;
    private int idTinhTrang;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getCotDiemCanPhucKhao() {
        return cotDiemCanPhucKhao;
    }

    public void setCotDiemCanPhucKhao(String cotDiemCanPhucKhao) {
        this.cotDiemCanPhucKhao = cotDiemCanPhucKhao;
    }

    public float getDiemMongMuon() {
        return DiemMongMuon;
    }

    public void setDiemMongMuon(float DiemMongMuon) {
        this.DiemMongMuon = DiemMongMuon;
    }

    public String getLiDo() {
        return liDo;
    }

    public void setLiDo(String liDo) {
        this.liDo = liDo;
    }

    public Date getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(Date ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public int getIdTinhTrang() {
        return idTinhTrang;
    }

    public void setIdTinhTrang(int idTinhTrang) {
        this.idTinhTrang = idTinhTrang;
    }
}
