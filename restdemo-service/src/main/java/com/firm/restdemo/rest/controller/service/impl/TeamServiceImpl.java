package com.firm.restdemo.rest.controller.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firm.restdemo.backend.TeamDAO;
import com.firm.restdemo.backend.bo.CyclistBO;
import com.firm.restdemo.backend.bo.TeamBO;
import com.firm.restdemo.rest.controller.dto.CyclistDTO;
import com.firm.restdemo.rest.controller.dto.RoleType;
import com.firm.restdemo.rest.controller.dto.TeamDTO;
import com.firm.restdemo.rest.controller.service.ITeamService;
import com.firm.restdemo.rest.converter.CyclistConverter;

@Service
public class TeamServiceImpl implements ITeamService {
	
	@Autowired
	private TeamDAO teamManager;
	
	@Autowired
	private CyclistConverter converter;

	public List<TeamDTO> getAllTeam()throws Exception{
		List<TeamBO> lstTeam;
		List<TeamDTO> teams = new ArrayList<TeamDTO>();
		lstTeam = teamManager.retrieveAllTeam();
		
		for (TeamBO item : lstTeam) {
			TeamDTO team = new TeamDTO();
			team.setId(item.getId());
			team.setTeamManager(item.getTeamManager());
			team.setTeamName(item.getTeamName());
			
			List<CyclistDTO> cyclists = new ArrayList<CyclistDTO>();
			
			for (CyclistBO cyclistItem : item.getCyclists()) {
				CyclistDTO cyclist = new CyclistDTO();
				cyclists.add(converter.convert(cyclistItem));
			}
			
			team.setCyclists(cyclists);
			teams.add(team);
		}
		
		
		return teams;
	}

}
