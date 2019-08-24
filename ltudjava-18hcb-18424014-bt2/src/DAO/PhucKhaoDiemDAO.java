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
public class PhucKhaoDiemDAO {
    public List<PhucKhaoDiem> laythongtinphuckhaodiem()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<PhucKhaoDiem> lst = null;
        try
        {
            String hql = "from PhucKhaoDiem";
            Query query = session.createQuery(hql);
            lst = query.list();
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return lst;
    }
    
    public PhucKhaoDiem laythongtintheostudentidvamamon(String studentid, String mamon)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        PhucKhaoDiem pkd = null;
        try {
            String hql = "from PhucKhaoDiem where studentid = :studentid and mamon = :mamon";
            Query query = session.createQuery(hql);
            query.setParameter("studentid", studentid);
            query.setParameter("mamon", mamon);
            List<PhucKhaoDiem> lst = query.list();
            int size = lst.size();
            for(int i = 0; i < size; i++)
            {
                pkd = lst.get(i);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        finally
        {
            session.close();
        }
        return pkd;
    }
    
    public boolean themphuckhaodiem(PhucKhaoDiem OT)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(laythongtintheostudentidvamamon(OT.getStudentid(), OT.getMamon()) != null)
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
}
