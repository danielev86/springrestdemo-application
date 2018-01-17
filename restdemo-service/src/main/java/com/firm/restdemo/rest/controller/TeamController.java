package com.firm.restdemo.rest.controller;

import java.io.Serializable;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.firm.restdemo.rest.controller.dto.Response;
import com.firm.restdemo.rest.controller.dto.TeamDTO;
import com.firm.restdemo.rest.controller.service.ITeamService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/rest")
public class TeamController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ITeamService teamService;
	
	@RequestMapping(produces="application/json", method= RequestMethod.GET, value="/allTeam")
	public ResponseEntity<Response<List<TeamDTO>>> getAllTeams(){
		List<TeamDTO> lstResult = null;
		Response<List<TeamDTO>> response = new Response<List<TeamDTO>>();
		try {
			lstResult = teamService.getAllTeam();
			response.setBodyResult(lstResult);
			response.setResult(true);
		} catch (Exception e) {
			response.setBodyResult(new ArrayList<TeamDTO>());
			response.setResult(false);
		}
		

		ResponseEntity<Response<List<TeamDTO>>> result = new ResponseEntity<Response<List<TeamDTO>>>(response, HttpStatus.OK);
		return result;
	}

}
