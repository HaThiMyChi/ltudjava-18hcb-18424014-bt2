/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import POJO.User;
import connect.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ha Chi
 */
public class ChangePasswordDAO {
    public User getUserNameFromLogin (String userName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        User  user = new User();
        try {
            session.beginTransaction();
            String hql = "from User where Username = :username";
            Query query = session.createQuery(hql);
            query.setParameter("username", userName);
            List<User> list = query.list();
            int size  = list.size();
            int i;
            for (i = 0; i < size; i++) {
                user.setAccountID(list.get(i).getAccountID());
                user.setUsername(list.get(i).getUsername());
                user.setPassword(list.get(i).getPassword());
            }
        } catch(Exception ex){
            if(session.getTransaction() != null)
            {
                session.getTransaction().rollback();
            }
        }
        finally
        {
            session.close();
        }
        return user;
    }
    
    public boolean  updateUserName(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        if (getUserNameFromLogin(user.getUsername()) == null) {
            return false;
        }
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.update(user);
            transaction.commit();
        }
        catch(Exception ex)
        {
            transaction.rollback();
        }
        finally
        {
            session.close();
        }
        return true;
    }

}
