package com.firm.restdemo.backend.mockdata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.firm.restdemo.backend.bo.CyclistBO;
import com.firm.restdemo.backend.bo.RoleTypeBO;
import com.firm.restdemo.backend.bo.TeamBO;
import com.firm.restdemo.constants.IRestDemoConstants;

@Component
public class TeamDAOMock {
	
	public List<TeamBO> retrieveAllTeamData() {
		List<TeamBO> lstTeam = new ArrayList<TeamBO>();
		TeamBO team = new TeamBO();
		team.setId(1L);
		team.setTeamManager("Brent Copeland");
		team.setCyclists(new ArrayList<CyclistBO>());
		team.getCyclists().add(getFirstCyclist());
		team.getCyclists().add(getSecondCyclist());
		team.getCyclists().add(getThirdCyclist());
		lstTeam.add(team);
		return lstTeam;
	}
	
	
	private CyclistBO getFirstCyclist() {
		CyclistBO cyclist = new CyclistBO();
		cyclist.setAge(33);
		cyclist.setFirstName("Valerio");
		cyclist.setLastName("Agnoli");
		cyclist.setContractExpiresYear(2018);
		RoleTypeBO roleType = new RoleTypeBO();
		roleType.setRoleType(IRestDemoConstants.TEAM_MATE_ROLE_TYPE);
		cyclist.setRoleType(roleType);
		cyclist.setId(1L);
		return cyclist;
	}
	
	private CyclistBO getSecondCyclist() {
		CyclistBO cyclist = new CyclistBO();
		cyclist.setAge(33);
		cyclist.setFirstName("Vincenzo");
		cyclist.setLastName("Nibali");
		cyclist.setContractExpiresYear(2018);
		RoleTypeBO roleType = new RoleTypeBO();
		roleType.setRoleType(IRestDemoConstants.LEADER_ROLE_TYPE);
		cyclist.setRoleType(roleType);
		cyclist.setId(2L);
		return cyclist;
	}
	
	private CyclistBO getThirdCyclist() {
		CyclistBO cyclist = new CyclistBO();
		cyclist.setAge(27);
		cyclist.setFirstName("Sonny");
		cyclist.setLastName("Colbrelli");
		cyclist.setContractExpiresYear(2018);
		RoleTypeBO roleType = new RoleTypeBO();
		roleType.setRoleType(IRestDemoConstants.SPRINTER_ROLE_TYPE);
		cyclist.setRoleType(roleType);
		cyclist.setId(2L);
		return cyclist;
	}
	

}
