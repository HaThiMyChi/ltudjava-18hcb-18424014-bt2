/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.*;
import connect.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ha Chi
 */
public class MonHocDAO {

    public List<MonHoc> layThongTinMonHoc(){
        List<MonHoc> list = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from MonHoc";
            Query query = session.createQuery(hql);
            list = query.list();
        } catch(Exception e) {
            e.getMessage();
        } finally {
            session.close();
        }
        return list;
    }
    
    public MonHoc layThongTinMonHoctheotenmonhoc(String tenmon){
        MonHoc mh = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from MonHoc where TenMon = :tenmon";
            Query query = session.createQuery(hql);
            query.setParameter("tenmon", tenmon);
            List<MonHoc> list = query.list();
            int size = list.size();
            for(int i = 0; i < size; i++)
            {
                mh = list.get(i);
            }
        } catch(Exception e) {
            e.getMessage();
        } finally {
            session.close();
        }
        return mh;
    }
    
    public MonHoc laythongtinmonhoctheoID(String ID)
    {
        MonHoc mh = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            mh = (MonHoc)session.get(MonHoc.class, ID);
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return mh;
    }
    
    public boolean themmonhoc(MonHoc OT)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(laythongtinmonhoctheoID(OT.getMaMon()) != null)
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
