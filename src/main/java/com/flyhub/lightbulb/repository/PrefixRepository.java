package com.flyhub.lightbulb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyhub.lightbulb.models.Prefix;


@Repository
public interface PrefixRepository extends JpaRepository<Prefix, Integer> {

}
