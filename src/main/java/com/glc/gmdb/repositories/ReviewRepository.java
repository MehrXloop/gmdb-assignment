package com.glc.gmdb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glc.gmdb.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

}
