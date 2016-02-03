package com.projectManagement;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {
   	
	@Id @GeneratedValue
	/*@OneToOne(mappedBy="user")
    	private UserProfile userprofile;*/	
  	@Column(name = "USER_ID")
  	private int userId;
   	@Column(name = "USER_NAME")
  	private String userName;	
	@Column(name = "EMAIL_ID")
	private String emailId;
	@Column(name = "PASSWORD")
	private String password;

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
