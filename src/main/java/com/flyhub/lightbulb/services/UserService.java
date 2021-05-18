package com.flyhub.lightbulb.services;

import java.awt.print.Pageable;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.flyhub.lightbulb.models.User;
import com.flyhub.lightbulb.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	public User addUser(User user) {
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setCreateDate(Calendar.getInstance());
		
		return userRepository.save(user);
	}
	
//	public List<User> getAllUsers(){
//
//		
//		return userRepository.findAll();
//		
//	}
	
	public List<User> getLikeUsers(String keyword){
		
//		PageRequest pageable = PageRequest.of(pageNo, pageSize);

		return userRepository.findLike(keyword);
		
	}
	
	public Optional<User> getUserById(String id) {
		return userRepository.findById(id);
		
	}
	
	public User updateUser(String id, User user) {
		return userRepository.save(user);
	}
	
	public void deleteUser(String id) {
		userRepository.deleteById(id);
	}
	
	public Page<User> findPaginated(int pageNo, int pageSize){
		
		PageRequest pageable = PageRequest.of(pageNo-1, pageSize);
		
		return userRepository.findAll(pageable);
	}
	
//	public Page<User> findLikePaginated(int pageNo, int pageSize){
//		
//		PageRequest pageable = PageRequest.of(pageNo, pageSize);
//		
//		return getLikeUsers(pageable, String keyword);
//	}
	

}
