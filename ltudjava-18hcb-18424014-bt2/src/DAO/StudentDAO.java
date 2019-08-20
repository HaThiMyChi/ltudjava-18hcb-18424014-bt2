/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.*;
import java.util.List;
import org.hibernate.Session;
import connect.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 *
 * @author Ha Chi
 */
public class StudentDAO {

    public List<Student> laythongtinsinhvien() {
        List<Student> lst = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from Student";
            Query query = session.createQuery(hql);
            lst = query.list();
        } catch (Exception e) {
            e.getMessage();
        } finally {
            session.close();
        }
        return lst;
    }

    public List<String> laythongtinimportfilecsv(String filename) throws FileNotFoundException, IOException {
        List<String> lst = new ArrayList<>();
        File file = new File(filename);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String readLine = "";
        try {
            while ((readLine = bufferedReader.readLine()) != null) {
                lst.add(readLine);
            }
            return lst;
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }

    public List<Student> laythongtinsinhvien(String malop) {
        List<Student> lst = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from Student where malop = :malop";
            Query query = session.createQuery(hql);
            query.setParameter("malop", malop);
            lst = query.list();
        } catch (Exception e) {
            e.getMessage();
        } finally {
            session.close();
        }
        return lst;
    }

    public Student laythongtinsinhvientheoID(String ID) {
        Student st = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            st = (Student) session.get(Student.class, ID);
        } catch (Exception e) {
            e.getMessage();
        } finally {
            session.close();
        }
        return st;
    }

    public boolean themsinhvien(Student OT) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (laythongtinsinhvientheoID(OT.getStudentid()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(OT);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            session.close();
        }
        return true;
    }
}
