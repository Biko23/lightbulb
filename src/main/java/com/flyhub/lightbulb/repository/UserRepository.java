package com.flyhub.lightbulb.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.flyhub.lightbulb.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	@Query("SELECT u FROM User u WHERE u.username = :username")
	public User getUserByUsername(@Param("username") String username);
	
	@Query("SELECT u FROM User u WHERE u.firstName LIKE %?1% OR"
									+ " u.middleName LIKE %?1% OR"
									+ " u.lastName LIKE %?1% OR"
									+ " u.username LIKE %?1%")
	public List<User> findLike(@Param(value="keyword") String keyword);
	
}
