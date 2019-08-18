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

/**
 *
 * @author Ha Chi
 */
public class UserDAO {
    public User CheckLogin (String username, String password)
    {
        User us = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from User where Username = :username and Password = :password";
            Query query = session.createQuery(hql);
            query.setParameter("username", username);
            query.setParameter("password", password);
            List<User> lst = query.list();
            int size = lst.size();
            for(int i = 0; i < size; i++)
            {
                us = lst.get(i);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        finally
        {
            session.close();
        }
        return us;
    }
}
