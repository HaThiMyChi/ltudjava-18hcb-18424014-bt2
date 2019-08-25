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
public class Student implements Serializable{
    private static final long serialVersionUID = 1L;
    private String studentid;
    private String fullname;
    private short sex;
    private String identitycard;
    private String malop;
    
    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public short getSex() {
        return sex;
    }

    public void setSex(short sex) {
        this.sex = sex;
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }
    
}
