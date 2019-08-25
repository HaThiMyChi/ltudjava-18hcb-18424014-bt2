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
import org.hibernate.Query;
import org.hibernate.Transaction;
/**
 *
 * @author Ha Chi
 */
public class LichPhucKhaoDAO {
    public List<LichPhucKhao> laythongtin()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<LichPhucKhao> lst = null;
        try {
            String hql = "from LichPhucKhao";
            Query query = session.createQuery(hql);
            lst = query.list();
        } catch (Exception e) {
            e.getMessage();
        }
        finally
        {
            session.close();
        }
        return lst;
    }
    
    public LichPhucKhao laythongtintheoID(int ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        LichPhucKhao lpk = null;
        try {
            lpk = (LichPhucKhao) session.get(LichPhucKhao.class, ID);
        } catch (Exception e) {
            e.getMessage();
        }
        finally
        {
            session.close();
        }
        return lpk;
    }
    
    public boolean themlichphuckhao(LichPhucKhao OT)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(laythongtintheoID(OT.getId()) != null)
        {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(OT);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.getMessage();
        }
        finally
        {
            session.close();
        }
        return true;
    }
    
    public boolean capnhatlichphuckhao(LichPhucKhao OT)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(laythongtintheoID(OT.getId()) == null)
        {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(OT);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.getMessage();
        }
        finally
        {
            session.close();
        }
        return true;
    }
    
    public boolean XoaLichPhucKhao(int ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        LichPhucKhao lpk = laythongtintheoID(ID);
        if(lpk == null)
        {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(ID);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.getMessage();
        }
        finally
        {
            session.close();
        }
        return true;
    }
}
