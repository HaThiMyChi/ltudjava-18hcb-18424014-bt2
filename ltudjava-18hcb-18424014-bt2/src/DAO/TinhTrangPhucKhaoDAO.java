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

/**
 *
 * @author Ha Chi
 */
public class TinhTrangPhucKhaoDAO {

    public List<TinhTrangPhucKhao> laythongtin() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<TinhTrangPhucKhao> lst = null;
        try {
            String hql = "from TinhTrangPhucKhao";
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
    
    public TinhTrangPhucKhao laythongtintheoID(int ID)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        TinhTrangPhucKhao tinhtrang = null;
        try {
            tinhtrang = (TinhTrangPhucKhao)session.get(TinhTrangPhucKhao.class, ID);
        } catch (Exception e) {
            e.getMessage();
        }
        finally
        {
            session.close();
        }
        return tinhtrang;
    }
    
    public TinhTrangPhucKhao laythongtintheoten(String tentinhtrang) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        TinhTrangPhucKhao tinhtrang = null;
        try {
            String hql = "from TinhTrangPhucKhao where tenTinhTrangPhucKhao = :ten";
            Query query = session.createQuery(hql);
            query.setParameter("ten", tentinhtrang);
            List<TinhTrangPhucKhao> lst = query.list();
            int size = lst.size();
            for(int i = 0; i < size; i++)
            {
                tinhtrang = lst.get(i);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        finally
        {
            session.close();
        }
        return tinhtrang;
    }
}
