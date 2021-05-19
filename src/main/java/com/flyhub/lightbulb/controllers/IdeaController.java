package com.flyhub.lightbulb.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

//import org.hibernate.mapping.Array;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.flyhub.lightbulb.models.Attachment;
import com.flyhub.lightbulb.models.Idea;
import com.flyhub.lightbulb.models.IdeaCategory;
import com.flyhub.lightbulb.models.Note;
import com.flyhub.lightbulb.models.User;
import com.flyhub.lightbulb.repository.AttachmentRepository;
import com.flyhub.lightbulb.repository.UserRepository;
import com.flyhub.lightbulb.services.AttachmentService;
import com.flyhub.lightbulb.services.IdeaCategoryService;
//import com.flyhub.lightbulb.models.Idea;
import com.flyhub.lightbulb.services.IdeaService;
import com.flyhub.lightbulb.services.NotesService;
import com.flyhub.lightbulb.services.UserService;
import com.sun.el.stream.Optional;
//import com.sun.tools.javac.code.Attribute.Array;


@Controller
public class IdeaController {
	@Autowired
	IdeaService ideaService;
	
	@Autowired
	private IdeaCategoryService ideaCategoryService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private NotesService notesService;
	
	@Autowired
	private AttachmentService attachmentService;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AttachmentRepository attachmentRepository;
	
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
	public String registerIdea(Idea idea,
								Model model,
								@RequestParam("attachment") MultipartFile multipartFile,
								Attachment attachment,
								RedirectAttributes ra) throws IOException {
		
		
		
//		model.addAttribute("global_user_id", userService.)
		
		String ideaId = ideaService.addIdea(idea).getIdeaId();
		
		attachmentService.addAttachment(multipartFile, attachment, ideaId);
		
		ra.addFlashAttribute("message", "Idea Saved");
		
		return "redirect:/idea_home";
	}
	@GetMapping("/add_attachment/{ideaId}")
	public String addAttachment(@PathVariable(name="ideaId") String ideaId, Model model) {
		
		return "add_attachment";
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
	
	@GetMapping("/view_idea/{ideaId}")
	public String viewIdea(@PathVariable(name="ideaId") String ideaId, Model model){
		//Array notely = new Arr
		List<Attachment> attachments = attachmentRepository.findAll();
		List<Note> notes = notesService.getAllNotes();
		ArrayList<Note> notely = new ArrayList<>();
		for (Note note: notes) {
			if(note.getIdea().getIdeaId().equals(ideaId)) {
				notely.add(note);
				model.addAttribute("notes", notely);
			}
		}
		model.addAttribute("attachments", attachments);
		model.addAttribute("idea", ideaService.getIdeaById(ideaId).get());
		
		return "idea_profile";
	}
	
	@GetMapping("/download")
	public void downloadFiles(@Param("attachmentId") Integer attachmentId, HttpServletResponse response) throws Exception {
		java.util.Optional<Attachment> file = attachmentService.getAttachmentById(attachmentId);
		
		if(!file.isPresent()) {
			throw new Exception("Couldn't find the file with ID:" + attachmentId);
		}
		
		Attachment attachment = file.get();
		
		response.setContentType("application/octet-stream");
		String headerKey = "Content-Disposition";
		String headerValue = "attachment; filename=" + attachment.getAttachmentName();
		
		response.setHeader(headerKey, headerValue);
		
		ServletOutputStream outputStream = response.getOutputStream();
		
		outputStream.write(attachment.getContent());
		outputStream.close();
	}
	

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
