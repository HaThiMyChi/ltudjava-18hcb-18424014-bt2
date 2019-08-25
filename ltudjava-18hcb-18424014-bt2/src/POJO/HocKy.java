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
public class HocKy implements Serializable{
    private static final long serialVersionUID = 1L;
    private int mahocky;
    private String tenhocky;
    
    public int getMahocky() {
        return mahocky;
    }

    public void setMahocky(int mahocky) {
        this.mahocky = mahocky;
    }

    public String getTenhocky() {
        return tenhocky;
    }

    public void setTenhocky(String tenhocky) {
        this.tenhocky = tenhocky;
    }
    
}
