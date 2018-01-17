package com.firm.restdemo.rest.controller.dto;

import java.io.Serializable;
import java.util.List;

public class TeamDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String teamName;
	
	private String teamManager;
	
	private List<CyclistDTO> cyclists;

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

	public List<CyclistDTO> getCyclists() {
		return cyclists;
	}

	public void setCyclists(List<CyclistDTO> cyclists) {
		this.cyclists = cyclists;
	}

}
