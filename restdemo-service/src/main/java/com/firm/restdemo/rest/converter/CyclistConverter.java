package com.firm.restdemo.rest.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.firm.restdemo.backend.bo.CyclistBO;
import com.firm.restdemo.rest.controller.dto.CyclistDTO;
import com.firm.restdemo.rest.controller.dto.RoleType;

@Component("cyclistConverter")
public class CyclistConverter implements Converter<CyclistBO, CyclistDTO>{

	public CyclistDTO convert(CyclistBO source) {
		CyclistDTO target = new CyclistDTO();
		
		RoleType roleType = new RoleType();
		roleType.setId(source.getRoleType().getId());
		roleType.setRoleType(source.getRoleType().getRoleType());
		
		target.setRoleType(roleType);
		target.setAge(source.getAge());
		target.setContractExpiresYear(source.getContractExpiresYear());
		target.setFirstName(source.getFirstName());
		target.setLastName(source.getLastName());
		target.setId(source.getId());
		
		return target;
	}

}
