package com.projectManagement;

import javax.persistence.*;

@Entity
@Table(name = "TEAMS")
public class Team {
   	
	@Id @GeneratedValue
	@Column(name = "TEAM_ID")
  	private int teamId;	
	@Column(name = "TEAM_NAME")
	private String teamName;
	@Column(name = "TEAM_LEADER")
	private int teamLeader;
	@OneToOne
    	@JoinColumn(name = "USER_ID")
	private User user;

	public int getTeamId() {
      		return teamId;
   	}
   	
	public void setTeamId( int teamId ) {
      		this.teamId = teamId;
   	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

}