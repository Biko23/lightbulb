package com.flyhub.lightbulb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flyhub.lightbulb.models.Postfix;

@Repository
public interface PostfixRepository extends JpaRepository<Postfix, Integer> {

}
