package com.projectManagement;

import java.util.List;
import java.util.ArrayList;

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
		List<User> list = new ArrayList<User>();
		try {
			tx = session.getTransaction();
			tx.begin();
			list = session.createQuery("from User").list(); 
			User user = new User();
			for(int i=0; i<list.size();i++){
				user=(User)list.get(i);
				if(user.getEmailId().equals(email)){
					return false;
				}
			}
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
