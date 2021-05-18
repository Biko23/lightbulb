package com.flyhub.lightbulb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyhub.lightbulb.models.Prefix;
import com.flyhub.lightbulb.repository.PrefixRepository;

@Service
public class PrefixService {
	
	@Autowired
	private PrefixRepository prefixRepository;
	
	public List<Prefix> getAllPrefix(){
		
		return prefixRepository.findAll();
	}
	
	public Prefix addPrefix(Prefix prefix) {
		
		return prefixRepository.save(prefix); 
	}
	
	public Optional<Prefix> getPrefixById(Integer prefixId) {
		
		return prefixRepository.findById(prefixId);
	}
	
	public void deletePrefix(Integer prefixId) {
		
		prefixRepository.deleteById(prefixId);
	}

}
