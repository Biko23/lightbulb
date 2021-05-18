package com.flyhub.lightbulb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyhub.lightbulb.models.IdeaEvent;
import com.flyhub.lightbulb.repository.IdeaEventRepository;

@Service
public class IdeaEventService {
	
	@Autowired
	private IdeaEventRepository ideaEventRepository;
	
	public List<IdeaEvent> getAllIdeaEvents(){
		
		return ideaEventRepository.findAll();
	}
	
	public IdeaEvent addIdeaEvent(IdeaEvent ideaEvent) {
		
		return ideaEventRepository.save(ideaEvent);
	}
	
	public Optional<IdeaEvent> getIdeaEventById(Integer eventId){
		
		return ideaEventRepository.findById(eventId);
	}
	
	public void deleteIdeaEvent(Integer eventId) {
		
		ideaEventRepository.deleteById(eventId);
	}

}
