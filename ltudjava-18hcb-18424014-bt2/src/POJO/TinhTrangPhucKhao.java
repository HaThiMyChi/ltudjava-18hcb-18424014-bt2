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
public class TinhTrangPhucKhao implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String tenTinhTrangPhucKhao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenTinhTrangPhucKhao() {
        return tenTinhTrangPhucKhao;
    }

    public void setTenTinhTrangPhucKhao(String tenTinhTrangPhucKhao) {
        this.tenTinhTrangPhucKhao = tenTinhTrangPhucKhao;
    }
}
