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
/**
 *
 * @author Ha Chi
 */
public class HocKyDAO {
    public List<HocKy> laythongtinhocky()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<HocKy> lst = null;
        try
        {
            String hql = "from HocKy";
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
    
    public HocKy laythongtinhockytheohocky(int ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        HocKy hk = null;
        try
        {
            hk = (HocKy) session.get(HocKy.class, ID);
        }
        catch(Exception ex)
        {
            ex.getMessage();
        }
        finally
        {
            session.close();
        }
        return hk;
    }
}
