package com.firm.restdemo.rest.controller.dto;

import java.io.Serializable;

public class CyclistDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private RoleType roleType;
	
	private Integer contractExpiresYear;
	
	private Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public RoleType getRoleType() {
		return roleType;
	}

	public void setRoleType(RoleType roleType) {
		this.roleType = roleType;
	}

	public Integer getContractExpiresYear() {
		return contractExpiresYear;
	}

	public void setContractExpiresYear(Integer contractExpiresYear) {
		this.contractExpiresYear = contractExpiresYear;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
