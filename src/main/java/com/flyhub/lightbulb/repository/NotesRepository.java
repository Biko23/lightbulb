package com.flyhub.lightbulb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyhub.lightbulb.models.Notes;

@Repository
public interface NotesRepository extends JpaRepository<Notes, Integer> {

}
