package com.flyhub.lightbulb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.flyhub.lightbulb.models.Role;
//import com.flyhub.lightbulb.models.User;
import com.flyhub.lightbulb.services.RoleService;

@Controller
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@GetMapping("/roles")
	public String viewRoles(Model model) {
		model.addAttribute("roles", roleService.getAllRoles());
		return "roles";
	}
	
	@GetMapping("/add_role")
	public String addRoleForm(Role role, Model model) {
		model.addAttribute("role", role);
		return "add_roles";
	}

	@PostMapping("/add_role")
	public String registerRoles(Role role, Model model) {
		model.addAttribute(roleService.addRole(role));
		return "add_roles";
	}

}
