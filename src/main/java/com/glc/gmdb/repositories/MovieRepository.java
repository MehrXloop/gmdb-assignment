package com.glc.gmdb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glc.gmdb.model.Movie;


public interface MovieRepository extends JpaRepository<Movie, Integer>{
}
