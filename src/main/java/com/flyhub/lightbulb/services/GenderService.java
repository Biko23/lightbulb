package com.flyhub.lightbulb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyhub.lightbulb.models.Gender;
import com.flyhub.lightbulb.repository.GenderRepository;

@Service
public class GenderService {
	
	@Autowired
	private GenderRepository genderRepository;
	
	
	public List<Gender> getAllGenders(){
		
		return genderRepository.findAll();
	}
	
	public Gender addGender(Gender gender) {
		
		return genderRepository.save(gender);
	}
	
	public Optional<Gender> getGenderById(Integer genderId){
		
		return genderRepository.findById(genderId);
	}
	
	public void deleteGender(Integer genderId) {
		
		genderRepository.deleteById(genderId);
	}
}
