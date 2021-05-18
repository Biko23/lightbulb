package com.flyhub.lightbulb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyhub.lightbulb.models.Notes;
import com.flyhub.lightbulb.repository.NotesRepository;

@Service
public class NotesService {
	
	@Autowired
	private NotesRepository notesRepository;
	
	public List<Notes> getAllNotes(){
		
		return notesRepository.findAll();
	}
	
	public Notes addNotes(Notes notes) {
		
		return notesRepository.save(notes);
	}
	
	public Optional<Notes> getNotesById(Integer noteId) {
		
		return notesRepository.findById(noteId);
	}
	
	public void deleteNotes(Integer noteId) {
		
		notesRepository.deleteById(noteId);
	}

}
