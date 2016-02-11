package com.projectManagement;

import org.hibernate.Session;  
import org.hibernate.Transaction;  
import org.hibernate.Query;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;

public class SignUpDao{

	public boolean signUpUserDetails(String fullName, String email, String password){  
 		Session session = HibernateSessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();

			User user = new User();
			user.setUserName(fullName);
			user.setEmailId(email);
			user.setPassword(password);
			
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
		return false;
	}
}
