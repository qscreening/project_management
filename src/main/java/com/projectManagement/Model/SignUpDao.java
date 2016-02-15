package com.projectManagement;

import org.hibernate.Session;  
import org.hibernate.Transaction;  
import org.hibernate.Query;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;

import java.security.*;

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
			user.setPassword(encryptPassword(password));
			
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
	
	public String encryptPassword(String password) {
        	String passwordToHash = password;
        	String generatedPassword = null;
        	try {
            		// Create MessageDigest instance for MD5
            		MessageDigest md = MessageDigest.getInstance("MD5");
            		//Add password bytes to digest
            		md.update(passwordToHash.getBytes());
            		//Get the hash's bytes 
            		byte[] bytes = md.digest();
            		//This bytes[] has bytes in decimal format;
            		//Convert it to hexadecimal format
            		StringBuilder sb = new StringBuilder();
            		for(int i=0; i< bytes.length ;i++)
            		{
                		sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            		}
            		//Get complete hashed password in hex format
            		generatedPassword = sb.toString();
        	} 
        	catch (NoSuchAlgorithmException e) {
            		e.printStackTrace();
        	}
        	return generatedPassword;
    	}

}
