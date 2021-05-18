package com.flyhub.lightbulb.services;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.flyhub.lightbulb.models.Idea;
import com.flyhub.lightbulb.repository.IdeaRepository;
import com.flyhub.lightbulb.repository.UserRepository;

@Service
public class IdeaService {
	
	@Autowired
	IdeaRepository ideaRepository;
	
//	@Autowired
//	private UserRepository userRepository;
	
	
	public List<Idea> getAllIdeas(){
		return ideaRepository.findAll();
	}
	
	public Idea addIdea(Idea idea) {
		
		if (idea.getCreatedDate() == null) {
			idea.setCreatedDate(Calendar.getInstance().getTime());
			
		}
		idea.setModifiedDate(Calendar.getInstance().getTime());
		return ideaRepository.save(idea);
	}
	
	public Optional<Idea> getIdeaById(String id){
		return ideaRepository.findById(id);
	}
	
	public Idea updateIdea(@PathVariable("ideaId") String ideaId, Idea idea){
		
		Idea updatingIdea = ideaRepository.findById(ideaId).get();
		updatingIdea.setDescription(idea.getDescription());
		updatingIdea.setTitle(idea.getTitle());
		updatingIdea.setExecutiveSummary(idea.getExecutiveSummary());
		updatingIdea.setBackgroundIdeaDescription(idea.getBackgroundIdeaDescription());
		updatingIdea.setModifiedDate(Calendar.getInstance().getTime());
		updatingIdea.setCreatedDate(Calendar.getInstance().getTime());
		
		return ideaRepository.save(updatingIdea);
		
//		return ideaRepository.findById(id);
	}
	
	public void deleteIdea(String id) {
		ideaRepository.deleteById(id);
	}

//	public Object getAllIdeas() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
