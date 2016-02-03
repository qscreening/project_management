package com.projectManagement;

import java.util.Set;

import javax.persistence.*;

@Embeddable
@Table(name = "PROJECT_MEMBERS")
public class ProjectMember {
   	
	@Id @GeneratedValue
  	@Column(name = "ID")
  	private int id;	
	@OneToMany
    	@JoinColumn(name = "PROJECT_ID")
	private Set<Project> project;	
	@Column(name = "MEMBER_ID")
	private int memberId;
	@OneToOne
    	@JoinColumn(name = "USER_ID")
	private User user;
	@Column(name = "OWNER")
	private boolean owner;
	
	public int getId() {
      		return id;
   	}

   	public void setId( int id ) {
      		this.id = id;
   	}
	
	public boolean getOwner() {
      		return owner;
   	}

   	public void setOwner( boolean owner ) {
      		this.owner = owner;
   	}
	
}
