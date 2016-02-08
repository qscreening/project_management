package com.projectManagement;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User implements Serializable {
   	
	@Id 
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	@Column(name = "USER_NAME")
	private String userName;	
	@Column(name = "EMAIL_ID")
	private String emailId;
	@Column(name = "PASSWORD")
	private String password;

	@OneToOne(mappedBy="user")
    	private UserProfile userProfile;

	public 	User() {
	
	}

	public void User(int id, String userName, String emailId, String password, UserProfile userProfile) {
		this.id = id;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.userProfile = userProfile;
    	}

	public int getId() {
		return id;
	}

   	public void setId( int id ) {
		this.id = id;
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
