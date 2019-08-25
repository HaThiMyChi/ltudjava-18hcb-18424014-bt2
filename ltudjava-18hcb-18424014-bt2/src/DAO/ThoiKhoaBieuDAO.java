/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import POJO.*;
import connect.HibernateUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ha Chi
 */
public class ThoiKhoaBieuDAO {
    public List<ThoiKhoaBieu> layThongTinThoiKhoaBieu(){
        List<ThoiKhoaBieu> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from ThoiKhoaBieu";
            Query query = session.createQuery(hql);
            list = query.list();
        } catch(Exception e) {
            e.getMessage();
        } finally {
            session.close();
        }
        return list;
    }
    
    public ThoiKhoaBieu layThongTinThoiKhoaBieuTheoID(String ID) {
        ThoiKhoaBieu tkb = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            tkb = (ThoiKhoaBieu) session.get(ThoiKhoaBieu.class, tkb);
        } catch (Exception e) {
            e.getMessage();
        } finally {
            session.close();
        }
        return tkb;
    }
    
    public List<ThoiKhoaBieu> layThongTinTKBTheoMaLop(String maLop) {
        List<ThoiKhoaBieu> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from ThoiKhoaBieu where MaLop = :maLop";
            Query query = session.createQuery(hql);
            query.setParameter("maLop", maLop);
            list = query.list();
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return list;
    }
    
    public List<ThoiKhoaBieu> layThongTinTKBTheoHocKyVaNamHoc(int HocKy, String NamHoc) {
        List<ThoiKhoaBieu> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from ThoiKhoaBieu where Hocky = :hocky and NamHoc = :namhoc";
            Query query = session.createQuery(hql);
            query.setParameter("hocky", HocKy);
            query.setParameter("namhoc", NamHoc);
            list = query.list();
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return list;
    }
    
    public List<ThoiKhoaBieu> layThongTinTKBTheoMaMon(String maMon) {
        List<ThoiKhoaBieu> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from ThoiKhoaBieu where MaMon = :maMon";
            Query query = session.createQuery(hql);
            query.setParameter("maMon", maMon);
            list = query.list();
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return list;
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
    
    public boolean themThoiKhoaBieu(ThoiKhoaBieu OT) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(layThongTinThoiKhoaBieuTheoID(OT.getMaLop()) != null) {
            return false;
        }
        Transaction transaction = null;
        try{
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
