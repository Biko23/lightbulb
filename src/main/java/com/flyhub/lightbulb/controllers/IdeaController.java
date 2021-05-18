package com.flyhub.lightbulb.controllers;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.flyhub.lightbulb.models.Idea;
import com.flyhub.lightbulb.models.IdeaCategory;
import com.flyhub.lightbulb.models.User;
import com.flyhub.lightbulb.repository.UserRepository;
import com.flyhub.lightbulb.services.IdeaCategoryService;
//import com.flyhub.lightbulb.models.Idea;
import com.flyhub.lightbulb.services.IdeaService;
import com.flyhub.lightbulb.services.UserService;


@Controller
public class IdeaController {
	@Autowired
	IdeaService ideaService;
	
	@Autowired
	private IdeaCategoryService ideaCategoryService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/idea_home")
	public String viewIdeas(Model model){
		model.addAttribute("ideas", ideaService.getAllIdeas());
		
		return "idea_home";
	}
	
	
	@GetMapping("/idea_register")
	public String registerIdeaForm(Idea idea, Model model) {
		
		List<IdeaCategory> category = ideaCategoryService.getAllIdeaCategories();
		
		model.addAttribute("idea", idea);
		model.addAttribute("categories", category);
		return "idea_register";
	}
	@PostMapping("/idea_register")
	public String registerIdea(Idea idea, Model model) {
//		model.addAttribute("global_user_id", userService.)
		
		ideaService.addIdea(idea);
		return "redirect:/idea_home";
	}
	
//	@PutMapping("{ideaId}/idea/{categoryId}")
//	public String assignIdeaToCategory(
//			@PathVariable String ideaId,
//			@PathVariable Integer categoryId
//			) {
//		IdeaCategory category = ideaCategoryService.getIdeaCategoryById(categoryId).get();
//		Idea idea = ideaService.getIdeaById(ideaId).get();
//		
//		idea.assignCategory(category);
//		ideaService.addIdea(idea);
//		
//		return "idea_home";
//		
//	}
	

	@GetMapping("/edit_idea/{ideaId}")
	public ModelAndView editIdeaForm(@PathVariable(name = "ideaId") String ideaId, Idea idea) {
		ModelAndView mav = new ModelAndView("edit_idea");
		mav.addObject("idea", ideaService.getIdeaById(ideaId));
		return mav;
	}
	@PostMapping("/edit_idea/{ideaId}")
	public String editIdea(@PathVariable(name="ideaId") String ideaId , Idea idea) {
		ideaService.updateIdea(ideaId, idea);
		System.out.println(ideaId);
		
		return "redirect:/idea_home";
	}
	
	@RequestMapping("/delete_idea/{ideaId}")
	public String trashIdea(@PathVariable(name="ideaId") String ideaId) {
		ideaService.deleteIdea(ideaId);
		
		return "redirect:/idea_home";
		
	}
	

}
