package com.flyhub.lightbulb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyhub.lightbulb.models.Note;

@Repository
public interface NotesRepository extends JpaRepository<Note, Integer> {

}
