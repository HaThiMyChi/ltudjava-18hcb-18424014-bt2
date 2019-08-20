/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import POJO.*;
import org.hibernate.Session;
import connect.*;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 *
 * @author Ha Chi
 */
public class ClassDAO {
    public List<ClassObjects> laythongtinlop()
    {
        List<ClassObjects> lst = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            String hql = "from ClassObjects";
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
    
    public ClassObjects laythongtinloptheomalop(String ID)
    {
        ClassObjects cl = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            cl = (ClassObjects) session.get(ClassObjects.class, ID);
        } catch (Exception e) {
            e.getMessage();
        }
        finally
        {
            session.close();
        }
        return cl;
    }
    
    public boolean themlop(ClassObjects OT)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(laythongtinloptheomalop(OT.getMalop()) != null)
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
