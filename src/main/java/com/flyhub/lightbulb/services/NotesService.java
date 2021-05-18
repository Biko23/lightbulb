package com.flyhub.lightbulb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyhub.lightbulb.models.Note;
import com.flyhub.lightbulb.repository.NotesRepository;

@Service
public class NotesService {
	
	@Autowired
	private NotesRepository notesRepository;
	
	public List<Note> getAllNotes(){
		
		return notesRepository.findAll();
	}
	
	public Note addNotes(Note note) {
		
		return notesRepository.save(note);
	}
	
	public Optional<Note> getNotesById(Integer noteId) {
		
		return notesRepository.findById(noteId);
	}
	
	public void deleteNotes(Integer noteId) {
		
		notesRepository.deleteById(noteId);
	}

}
