package com.flyhub.lightbulb.services;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.flyhub.lightbulb.models.Idea;
import com.flyhub.lightbulb.models.Note;
import com.flyhub.lightbulb.repository.IdeaRepository;
import com.flyhub.lightbulb.repository.NotesRepository;

@Service
public class NotesService {
	
	@Autowired
	private NotesRepository notesRepository;
	@Autowired
	private IdeaRepository ideaRepository;
	@Autowired
	private IdeaService ideaService;
	
	
	public List<Note> getAllNotes(){
		
		return notesRepository.findAll();
	}
	
	public Note addNotes(@PathVariable(name = "ideaId") String ideaId, Note note) {
		
		
		note.setCreatedDate(Calendar.getInstance().getTime());
		note.setIdea_id(ideaId);
//		note.setNoteId(null);
		
		
		return notesRepository.save(note);
	}
	
	public Optional<Note> getNotesById(Integer noteId) {
		
		return notesRepository.findById(noteId);
	}
	
	public void deleteNotes(Integer noteId) {
		
		notesRepository.deleteById(noteId);
	}

}
