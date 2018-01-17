package com.firm.restdemo.backend;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.firm.restdemo.backend.bo.TeamBO;
import com.firm.restdemo.backend.mockdata.TeamDAOMock;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TeamDAO {

	@Autowired
	private TeamDAOMock teamMock;
	
	public List<TeamBO> retrieveAllTeam(){
		
		List<TeamBO> lstResult = teamMock.retrieveAllTeamData();
		
		return CollectionUtils.isNotEmpty(lstResult) ? lstResult : new ArrayList<TeamBO>();
		
	}
	
}
