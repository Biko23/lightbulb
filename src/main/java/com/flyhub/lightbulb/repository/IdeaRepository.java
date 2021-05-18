package com.flyhub.lightbulb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyhub.lightbulb.models.Idea;

@Repository
public interface IdeaRepository extends JpaRepository<Idea, String> {

}
