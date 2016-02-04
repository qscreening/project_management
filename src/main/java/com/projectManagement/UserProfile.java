package com.projectManagement;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "USER_PROFILES")
public class UserProfile implements Serializable {
   	
	//@OneToOne
    	//@JoinColumn(name = "USER_ID")
	//private User user;
	@Id
	@Column(name = "USER_ID")
	private int userId;
	@Column(name = "PHONE_NUMBER")
	private long phoneNumber;
	
	public int getUserId(){
	   	return userId;
	}
	public void setUserId( int userId ) {
		this.userId = userId;
	}		

	public long getPhoneNumber() {
      		return phoneNumber;
   	}
   	
	public void setPhoneNumber( long phoneNumber ) {
      		this.phoneNumber = phoneNumber;
   	}
}
