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
public class PhucKhaoDiem implements Serializable{
    private static final long serialVersionUID = 1L;
    private String studentid;
    private String mamon;
    private String cotdiemcanphuckhao;
    private float diemmongmuon;
    private String lido;
    
    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getCotdiemcanphuckhao() {
        return cotdiemcanphuckhao;
    }

    public void setCotdiemcanphuckhao(String cotdiemcanphuckhao) {
        this.cotdiemcanphuckhao = cotdiemcanphuckhao;
    }

    public float getDiemmongmuon() {
        return diemmongmuon;
    }

    public void setDiemmongmuon(float diemmongmuon) {
        this.diemmongmuon = diemmongmuon;
    }

    public String getLido() {
        return lido;
    }

    public void setLido(String lido) {
        this.lido = lido;
    }
    
}
