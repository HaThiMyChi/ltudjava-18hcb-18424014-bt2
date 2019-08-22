/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import POJO.*;
import connect.HibernateUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ha Chi
 */
public class BangDiemDAO {

    public List<BangDiem> layTheoMaMonAndMaLop(String maLop, String maMon) {
        List<BangDiem> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from BangDiem where MaLop = :maLop and MaMon = :maMon";
            Query query = session.createQuery(hql);
            query.setParameter("maLop", maLop);
            query.setParameter("maMon", maMon);
            list = query.list();
        } catch (Exception ex) {
            ex.getMessage();
        } finally {
            session.close();
        }
        return list;
    }
    
    public BangDiem layTheoMaLopMaMonAndStudentID(String maLop, String maMon, String studentID)
    {
        BangDiem sr = null;
        List<BangDiem> lst = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from BangDiem where MaLop = :maLop and MaMon = :maMon and StudentID = :studentID";
            Query query = session.createQuery(hql);
            query.setParameter("maLop", maLop);
            query.setParameter("maMon", maMon);
            query.setParameter("studentID", studentID);
            lst = query.list();
            int size = lst.size();
            for(int i = 0; i < size; i++)
            {
                sr = lst.get(i);
            }
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally{
            session.close();
        }
        return sr;
    }
    
    public List<String> layThongTinImportFileCSV(String filename) throws FileNotFoundException, IOException{
        List<String> list = new ArrayList<>();
        File file = new File(filename);
        BufferedReader bufferReader = new BufferedReader(new FileReader(file));
        String readLine = "";
        try {
            while ((readLine = bufferReader.readLine()) != null) {
                list.add(readLine);
            }
            return list;
        } finally {
            if (bufferReader != null) {
                bufferReader.close();
            }
        }
    }
    
    public boolean insertBangDiem(BangDiem OT) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(layTheoMaLopMaMonAndStudentID(OT.getMaLop(), OT.getMaMon(), OT.getStudentID()) != null)
        {
            return false;
        }
        Transaction transaction = null;
        try
        {
            transaction = session.beginTransaction();
            session.save(OT);
            transaction.commit();
        }
        catch(Exception ex)
        {
            transaction.rollback();
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return true;
    }
    
    public boolean updateBangDiem(BangDiem bd) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(layTheoMaLopMaMonAndStudentID(bd.getMaLop(), bd.getMaMon(), bd.getStudentID()) == null) {
            return false;
        } else {
            Transaction transaction = null;
            try {
                transaction = session.beginTransaction();
                session.update(bd);
                transaction.commit();
            } catch (Exception e) {
                e.getMessage();
            }
            finally
            {
                session.close();
            }
        }
        return true;
    }
    
}
