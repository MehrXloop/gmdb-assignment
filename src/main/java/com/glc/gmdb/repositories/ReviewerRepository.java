package com.glc.gmdb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glc.gmdb.model.Reviewer;



public interface ReviewerRepository extends JpaRepository<Reviewer, Integer>{
    
}
