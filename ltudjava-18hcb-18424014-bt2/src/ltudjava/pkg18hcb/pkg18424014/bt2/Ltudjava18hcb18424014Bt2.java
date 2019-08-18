/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltudjava.pkg18hcb.pkg18424014.bt2;

import form.FormLogin;
import org.hibernate.Query;
import org.hibernate.Session;
import connect.*;
import POJO.*;
import java.util.List;
import org.hibernate.HibernateException;



/**
 *
 * @author Ha Chi
 */
public class Ltudjava18hcb18424014Bt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from User "; 
            Query query = session.createQuery(hql);
            List<User> lst = query.list();
            for(User ac : lst)
            {
                System.out.println(ac.getUsername());
            }
        }
        catch(HibernateException ex)
        {
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        finally
        {
            session.close();
            System.exit(0);
        }
    }
    
}
