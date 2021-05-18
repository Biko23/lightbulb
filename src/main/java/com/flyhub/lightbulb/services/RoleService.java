package com.flyhub.lightbulb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;

import com.flyhub.lightbulb.models.Role;
import com.flyhub.lightbulb.repository.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	RoleRepository roleRepository;
	
	public Role addRole(Role role) {
		return roleRepository.save(role);
	}
	
	public List<Role> getAllRoles(){
		return roleRepository.findAll();
	}



}
