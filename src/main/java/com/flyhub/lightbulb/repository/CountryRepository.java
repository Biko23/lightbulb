package com.flyhub.lightbulb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyhub.lightbulb.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
