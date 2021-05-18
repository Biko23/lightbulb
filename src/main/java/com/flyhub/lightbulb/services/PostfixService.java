package com.flyhub.lightbulb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyhub.lightbulb.models.Postfix;
import com.flyhub.lightbulb.repository.PostfixRepository;

@Service
public class PostfixService {
	
	@Autowired
	private PostfixRepository postfixRepository;
	
	public List<Postfix> getAllPostfix(){
		
		return postfixRepository.findAll();
	}
	
	public Postfix addPostfix(Postfix postfix) {
		
		return postfixRepository.save(postfix);
	}
	
	public Optional<Postfix> getPostfixById(Integer postfixId) {
		
		return postfixRepository.findById(postfixId);
	}
	
	public void deletePostfix(Integer postfixId) {
		
		postfixRepository.deleteById(postfixId);
	}

}
