package com.projectManagement;

import org.hibernate.Session;  
import org.hibernate.Transaction;  
import org.hibernate.Query;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import java.util.List;
import java.util.ArrayList;


public class SignInDao{

	public boolean signInUserDetails( String email, String password){  
		List<User> list = new ArrayList<User>();
 		Session session = HibernateSessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		Transaction tx = null;
		User user = new User();
		try {
			tx = session.getTransaction();
			tx.begin();
			list =  session.createQuery("from User").list();
			session.save(user);
			tx.commit();
			return true;
	        } catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
	        } finally {
			session.close();
 		}
 		 for (int i = 0; i < list.size(); i++){
 		 	user = (User)list.get(i);
 		 	if(user.getEmailId().equals(email) && user.getPassword().equals(password)){
 		 		return true;
 		 	}
 		 }	
		return false;
	}

}
