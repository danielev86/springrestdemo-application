package com.firm.restdemo.backend.bo;

import java.util.List;


public class TeamBO {
	
	private Long id;
	
	private String teamName;
	
	private String teamManager;
	
	private List<CyclistBO> cyclists;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamManager() {
		return teamManager;
	}

	public void setTeamManager(String teamManager) {
		this.teamManager = teamManager;
	}

	public List<CyclistBO> getCyclists() {
		return cyclists;
	}

	public void setCyclists(List<CyclistBO> cyclists) {
		this.cyclists = cyclists;
	}

}
