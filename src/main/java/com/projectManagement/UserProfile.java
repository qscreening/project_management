package com.projectManagement;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;  
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "USER_PROFILES")
public class UserProfile implements Serializable {
   	
	@Id
	@Column(name = "ID")
	private int userId;
	@OneToOne(mappedBy = "User")
	private User user = new User();
	@Column(name = "PHONE_NUMBER")
	private long phoneNumber;
	
	public int getUserId(){
	   	return userId;
	}
	public void setUserId( int userId ) {
		this.userId = userId;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public long getPhoneNumber() {
      		return phoneNumber;
   	}
   	
	public void setPhoneNumber( long phoneNumber ) {
      		this.phoneNumber = phoneNumber;
   	}

}
