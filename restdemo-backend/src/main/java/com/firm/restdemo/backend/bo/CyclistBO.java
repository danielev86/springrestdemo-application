package com.firm.restdemo.backend.bo;

public class CyclistBO {
	
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private RoleTypeBO roleType;
	
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

	public RoleTypeBO getRoleType() {
		return roleType;
	}

	public void setRoleType(RoleTypeBO roleType) {
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
