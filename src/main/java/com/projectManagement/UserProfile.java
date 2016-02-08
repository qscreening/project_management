package com.projectManagement;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "USER_PROFILES")
public class UserProfile implements Serializable {
   	
	@Id
    	@GeneratedValue
	@Column(name="USER_ID",nullable=false)
    	private int userId;

	@Column(name = "PHONE_NUMBER")
	private long phoneNumber;

	@OneToOne
    	@PrimaryKeyJoinColumn
    	private User user;
	
	public int getUserId(){
	   	return userId;
	}
	public void setUserId( int userId ) {
		this.userId = userId;
	}

	/*public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}*/

	public long getPhoneNumber() {
      		return phoneNumber;
   	}
   	
	public void setPhoneNumber( long phoneNumber ) {
      		this.phoneNumber = phoneNumber;
   	}

}
