/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;
import java.io.*;
/**
 *
 * @author Ha Chi
 */
public class NamHoc implements Serializable{
    private static final long serialVersionUID = 1L;
    private String manamhoc;
    private String tennamhoc;
    
    public String getManamhoc() {
        return manamhoc;
    }

    public void setManamhoc(String manamhoc) {
        this.manamhoc = manamhoc;
    }

    public String getTennamhoc() {
        return tennamhoc;
    }

    public void setTennamhoc(String tennamhoc) {
        this.tennamhoc = tennamhoc;
    }
    
}
