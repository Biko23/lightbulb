package com.flyhub.lightbulb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyhub.lightbulb.models.IdeaCategory;

@Repository
public interface IdeaCategoryRepository extends JpaRepository<IdeaCategory, Integer> {

}
