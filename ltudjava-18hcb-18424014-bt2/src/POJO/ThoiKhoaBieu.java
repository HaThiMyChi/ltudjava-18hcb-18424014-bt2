/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.io.Serializable;

/**
 *
 * @author Ha Chi
 */
public class ThoiKhoaBieu implements Serializable{
    private static final long serialVersionUID = 1L;
    private String MaLop;
    private String MaMon;
    private int Hocky;
    private String NamHoc;
    private String PhongHoc;
    private String Ghichu;

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public int getHocky() {
        return Hocky;
    }

    public void setHocky(int Hocky) {
        this.Hocky = Hocky;
    }

    public String getNamHoc() {
        return NamHoc;
    }

    public void setNamHoc(String NamHoc) {
        this.NamHoc = NamHoc;
    }

    public String getPhongHoc() {
        return PhongHoc;
    }

    public void setPhongHoc(String PhongHoc) {
        this.PhongHoc = PhongHoc;
    }

    public String getGhichu() {
        return Ghichu;
    }

    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }
}
