/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Ha Chi
 */
public class LichPhucKhao implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private Date ngayBatDau;
    private Date ngayKetThuc;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
   
   
}
