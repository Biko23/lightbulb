package com.flyhub.lightbulb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyhub.lightbulb.models.IdeaCategory;
import com.flyhub.lightbulb.repository.IdeaCategoryRepository;

@Service
public class IdeaCategoryService {
	
	@Autowired
	private IdeaCategoryRepository ideaCategoryRepository;
	
	public List<IdeaCategory> getAllIdeaCategories(){
		
		return ideaCategoryRepository.findAll();
	}
	
	public IdeaCategory addIdeaCategory(IdeaCategory ideaCategory) {
		
		return ideaCategoryRepository.save(ideaCategory);
	}
	
	public Optional<IdeaCategory> getIdeaCategoryById(Integer categoryId) {
		
		return ideaCategoryRepository.findById(categoryId);
	}
	
	public void deleteIdeaCategory(Integer categoryId) {
		
		ideaCategoryRepository.deleteById(categoryId);
	}

}
