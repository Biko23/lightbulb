package com.flyhub.lightbulb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyhub.lightbulb.models.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {

}
