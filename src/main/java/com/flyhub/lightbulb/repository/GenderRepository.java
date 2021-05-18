package com.flyhub.lightbulb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flyhub.lightbulb.models.Gender;

public interface GenderRepository extends JpaRepository<Gender, Integer> {

}
