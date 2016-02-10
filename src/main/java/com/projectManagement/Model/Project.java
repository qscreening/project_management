package com.projectManagement;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "PROJECTS")
public class Project implements Serializable {
   	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PROJECT_ID")
  	private int projectId;	
	@Column(name = "PROJECT_NAME")
	private String projectName;
	@Column(name = "OWNER")
	private int owner;
	//@OneToOne
    	//@JoinColumn(name = "USER_ID")
	//private User user;
	public 	Project() {
 
    	}
 
    	public Project(int projectId, String projectName, int owner) {
        	this.projectId = projectId;
        	this.projectName = projectName;
        	this.owner = owner;
    	}
	
	public int getOwner() {
      		return owner;
   	}
   	
	public void setOwner( int owner ) {
      		this.owner = owner;
   	}

	public int getProjectId() {
      		return projectId;
   	}
   	
	public void setProjectId( int projectId ) {
      		this.projectId = projectId;
   	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}	

}
