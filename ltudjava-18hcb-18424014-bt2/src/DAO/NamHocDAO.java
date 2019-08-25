/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import POJO.*;
import org.hibernate.Session;
import connect.*;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 *
 * @author Ha Chi
 */
public class NamHocDAO {
    public List<NamHoc> laythongtinnamhoc()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<NamHoc> lst = null;
        try {
            String hql = "from NamHoc";
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
    
    public NamHoc laythongtintheonamhoc(String namhoc)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        NamHoc nh = null;
        try {
            nh = (NamHoc) session.get(NamHoc.class, namhoc);
        } catch (Exception e) {
            e.getMessage();
        }
        finally
        {
            session.close();
        }
        return nh;
    }
    
    public boolean themnamhoc(NamHoc OT)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(laythongtintheonamhoc(OT.getManamhoc()) != null)
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
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return true;
    }
}
