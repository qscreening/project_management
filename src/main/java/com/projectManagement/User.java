package com.projectManagement;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User implements Serializable {
   	
	@Id @GeneratedValue	
  	@Column(name = "USER_ID")
  	private int userId;
	@OneToOne(mappedBy="user")
    	private UserProfile userprofile;
   	@Column(name = "USER_NAME")
  	private String userName;	
	@Column(name = "EMAIL_ID")
	private String emailId;
	@Column(name = "PASSWORD")
	private String password;

	public 	User() {
 
    	}
 
    	public User(int userId, String userName, String emailId, String password) {
        	this.userId = userId;
        	this.userName = userName;
        	this.emailId = emailId;
        	this.password = password;
    	}

   	public int getUserId() {
      		return userId;
   	}

   	public void setUserId( int userId ) {
      		this.userId = userId;
   	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	

}
