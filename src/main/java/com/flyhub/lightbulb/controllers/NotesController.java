package com.flyhub.lightbulb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.flyhub.lightbulb.models.Note;
import com.flyhub.lightbulb.services.IdeaService;
import com.flyhub.lightbulb.services.NotesService;

@Controller
public class NotesController {
	
	
	@Autowired
	private NotesService noteService;
	
	@Autowired
	private IdeaService ideaService;
	
	@GetMapping("/view_idea/{ideaId}/notes")
	public String getNotes(@PathVariable(name="ideaId") String ideaId, Model model, Note newNotes){
		
		model.addAttribute("newNotes", newNotes);
		model.addAttribute("idea", ideaService.getIdeaById(ideaId).get());
		List<Note> notes = noteService.getAllNotes();
		ArrayList<Note> notely = new ArrayList<>();
		for (Note note: notes) {
			if(note.getIdea().getIdeaId().equals(ideaId)) {
				notely.add(note);
				model.addAttribute("notes", notely);
			}
		}
		
		
		return "make_note";
	}
	
	@PostMapping("/view_idea/{ideaId}/notes")
	public String makeNote(@PathVariable(name="ideaId") String ideaId, Note newNotes) {
		
		
		
		noteService.addNotes(ideaId, newNotes);
		return "redirect:notes";
		
	}

}
