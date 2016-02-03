package com.projectManagement;

import org.hibernate.Session;  
import org.hibernate.Transaction;  
import java.util.List;
import java.util.ArrayList;
import org.hibernate.Query;

public class UserDao{

	public static List<User> getListOfUsers(){
	        List<User> list = new ArrayList<User>();
	
	        Session session = HibernateSessionManager.getSessionFactory().openSession();
		session.beginTransaction();
	
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            list = session.createQuery("from User").list();
		    session.save(list);
	            tx.commit();
	        } catch (Exception e) {
	            if (tx != null) {
	                tx.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return list;
	}

}
