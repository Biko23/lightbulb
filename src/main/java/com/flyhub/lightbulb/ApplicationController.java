package com.flyhub.lightbulb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	
	@GetMapping("/")
	public String goHome(){
		return "user_profile";
	}
	
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout(){
		return "login";
	}
	
//	@GetMapping("/registration")
//	public String userRegistration(){
//		return "register";
//	}

}
