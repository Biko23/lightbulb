package com.flyhub.lightbulb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.flyhub.lightbulb.models.Country;
import com.flyhub.lightbulb.models.Gender;
import com.flyhub.lightbulb.models.Prefix;
import com.flyhub.lightbulb.models.Role;
import com.flyhub.lightbulb.models.User;
import com.flyhub.lightbulb.services.CountryService;
import com.flyhub.lightbulb.services.GenderService;
import com.flyhub.lightbulb.services.PrefixService;
import com.flyhub.lightbulb.services.RoleService;
import com.flyhub.lightbulb.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	private PrefixService prefixService;
	
	@Autowired
	private GenderService genderService;
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping("/users")
	public String usersList(Model model, String keyword) {
		if(keyword != null) {
			
			model.addAttribute("users",userService.getLikeUsers(keyword));
			return "users";
		
		}else 
			return findPaginated(1, model);
		//{

//			model.addAttribute("users", userService.getAllUsers());
//			
//		}
//		return "users";
	}
	
	@GetMapping("/users/{globalUserId}")
	public String showUserProfile(@PathVariable(name="globalUserId") String globalUserId, Model model, Optional<User> user) {
		
		user = userService.getUserById(globalUserId);
		System.out.print(user);
		model.addAttribute("user", user);
		return "user_profile";
	}
	
	@GetMapping("users/page/{pageNo}")
	public String findPaginated(@PathVariable(value="pageNo") int pageNo, Model model) {
		int pageSize = 4;
		
		Page<User> page = userService.findPaginated(pageNo, pageSize);
		List<User> listUsers = page.getContent();
		
		model.addAttribute("currentPage",pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		model.addAttribute("users", listUsers);
		
		return "users";
	}
	
	@GetMapping("/registration")
	public String registerUserForm(User user, Model model) {
		
		List<Prefix> prefix = prefixService.getAllPrefix();
		List<Gender> gender = genderService.getAllGenders();
		List<Country> country = countryService.getAllCountrys();
		List<Role> role = roleService.getAllRoles();
		
		model.addAttribute("user", user);
		model.addAttribute("prefixes", prefix);
		model.addAttribute("genders", gender);
		model.addAttribute("countries", country);
		model.addAttribute("roles", role);
		return "register";
	}
	@PostMapping("registration")
	public String registerUser(User user, Model model) {
		userService.addUser(user);
		return "redirect:/users";
	}
	

	@GetMapping("users/edit/{globalUserId}")
	public ModelAndView editUserForm(@PathVariable(name = "globalUserId") String globalUserId, User user) {
		ModelAndView mav = new ModelAndView("edit_user");
		mav.addObject("user", userService.getUserById(globalUserId));
//		mav.addObject("genderLabel", user.);
//		User user = userService.updateUser(id, user);
		return mav;
	}
	
	@RequestMapping("users/delete/{globalUserId}")
	public String trashUser(@PathVariable(name="globalUserId") String globalUserId) {
		userService.deleteUser(globalUserId);
		
		return "redirect:/users";
		
	}

}
