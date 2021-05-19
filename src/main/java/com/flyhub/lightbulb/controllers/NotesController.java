package com.flyhub.lightbulb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.flyhub.lightbulb.models.Note;
import com.flyhub.lightbulb.services.NotesService;

@Controller
public class NotesController {
	
	
	@Autowired
	private NotesService noteService;
	
	@GetMapping("idea/{ideaId}/notes")
	public String getNotes(){
		
		return "notes";
	}
	
	@PostMapping("/idea/{ideaId}/notes")
	public String makeNote(Note note) {
		
		noteService.addNotes(note);
		return "redirect:idea_home";
		
	}

}
