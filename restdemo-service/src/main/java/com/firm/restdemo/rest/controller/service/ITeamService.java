package com.firm.restdemo.rest.controller.service;

import java.io.Serializable;
import java.util.List;

import com.firm.restdemo.rest.controller.dto.TeamDTO;

public interface ITeamService extends Serializable {

	public List<TeamDTO> getAllTeam()throws Exception;

}
