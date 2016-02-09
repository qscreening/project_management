package com.projectManagement;

import org.hibernate.Session;  
import org.hibernate.Transaction;  
import org.hibernate.Query;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;

public class SignUpDao{

	public void signUpUserDetails(User user){  
 		Session session = HibernateSessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			
			String fName = request.getParameter("fullName");
			String pword = request.getParameter("password");
			String cPword = request.getParameter("confirmPassword");

			User user = new User();
			user.setUserName(fName);
			user.setPassword(pword);
			user.setPassword(cPword);
			
			session.save(user);
			tx.commit();
	        } catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
	        } finally {
			session.close();
 	}  
}
