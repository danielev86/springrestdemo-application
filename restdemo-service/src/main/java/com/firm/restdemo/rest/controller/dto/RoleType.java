package com.firm.restdemo.rest.controller.dto;

import java.io.Serializable;

public class RoleType implements Serializable {
	
	private Long id;
	
	private String roleType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
}
