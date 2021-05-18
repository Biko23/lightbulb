package com.flyhub.lightbulb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyhub.lightbulb.models.Status;
import com.flyhub.lightbulb.repository.StatusRepository;

@Service
public class StatusService {
	
	@Autowired
	private StatusRepository statusRepository;
	
	public List<Status> getAllStatus(){
		
		return statusRepository.findAll();
	}
	
	public Status addStatus(Status status) {
		return statusRepository.save(status);
	}
	
	public Optional<Status> getStatusById(Integer statusId){
		
		return statusRepository.findById(statusId);
	}
	
	public void deleteStatus(Integer statusId) {
		
		statusRepository.deleteById(statusId);
	}

}
