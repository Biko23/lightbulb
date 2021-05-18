package com.flyhub.lightbulb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyhub.lightbulb.models.IdeaEvent;

@Repository
public interface IdeaEventRepository extends JpaRepository<IdeaEvent, Integer> {

}
