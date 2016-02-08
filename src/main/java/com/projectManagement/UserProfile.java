package com.projectManagement;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "USER_PROFILES")
public class UserProfile implements Serializable {
   	
	@JoinColumn(name = "ID")
	private int userId;
	@OneToOne
	private User user = new User();
	@Column(name = "PHONE_NUMBER")
	private long phoneNumber;

	public void UserProfile() {
 
	}
 
	public void UserProfile(int id, long phoneNumber, User user) {
		this.id = id;
		this.phoneNumber = password;
		this.user = user;
    	}
	
	public int getUserId(){
	   	return userId;
	}
	public void setUserId( int userId ) {
		this.userId = userId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getPhoneNumber() {
      		return phoneNumber;
   	}
   	
	public void setPhoneNumber( long phoneNumber ) {
      		this.phoneNumber = phoneNumber;
   	}

}
