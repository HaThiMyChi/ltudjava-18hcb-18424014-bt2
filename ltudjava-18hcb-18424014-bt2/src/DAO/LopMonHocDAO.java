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
public class LopMonHocDAO {
    public List<LopMonHoc> laythongtintheomalopvamamon(String malop, String mamon)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<LopMonHoc> lst = null;
        try {
            String hql = "from LopMonHoc where maLop = :malop and maMon = :mamon";
            Query query = session.createQuery(hql);
            query.setParameter("malop", malop);
            query.setParameter("mamon", mamon);
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
    
    public LopMonHoc laythongtintheomalopvamamonvastudentid(String malop, String mamon, String studentid)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        LopMonHoc lmh = null;
        try {
            String hql = "from LopMonHoc where maLop = :malop and maMon = :mamon and studentID = :studentid";
            Query query = session.createQuery(hql);
            query.setParameter("malop", malop);
            query.setParameter("mamon", mamon);
            query.setParameter("studentid", studentid);
            List<LopMonHoc> lst = query.list();
            int size = lst.size();
            for(int i = 0; i < size; i++)
            {
                lmh = lst.get(i);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        finally
        {
            session.close();
        }
        return lmh;
    }
    
    public boolean Insert(LopMonHoc OT)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if(laythongtintheomalopvamamonvastudentid(OT.getMaLop(), OT.getMaMon(), OT.getStudentID()) != null)
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
    
    public boolean Delete(String malop, String mamon, String studentid)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        LopMonHoc lmh = laythongtintheomalopvamamonvastudentid(malop, mamon, studentid);
        if(lmh == null)
        {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(lmh);
            transaction.commit();
        } catch (Exception e) {
            e.getMessage();
        }
        finally
        {
            session.close();
        }
        return true;
    }
}
