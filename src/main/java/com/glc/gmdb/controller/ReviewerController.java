package com.glc.gmdb.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glc.gmdb.model.Reviewer;
import com.glc.gmdb.repositories.MovieRepository;
import com.glc.gmdb.repositories.ReviewRepository;
import com.glc.gmdb.repositories.ReviewerRepository;

@RestController
@RequestMapping("/reviewers")
public class ReviewerController {
    @Autowired
    private ReviewerRepository reviewerRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    MovieRepository movieRepository;

    @GetMapping("/{id}")
    public Optional<Reviewer> getMovieById(@PathVariable int id) {
        return reviewerRepository.findById(id);
    }

    @PostMapping("")
    public void addReviewer(@RequestBody Reviewer reviewer) {
        reviewer.setNumberOfReviews(0);
        reviewer.setDateJoined(Date.valueOf(LocalDate.now()));
        reviewerRepository.save(reviewer);
    }

    @DeleteMapping("/{reviewerId}/{reviewId}")
    public void deleteReview(@PathVariable int reviewerId, @PathVariable int reviewId ) {
        if (reviewRepository != null) {
            reviewRepository.deleteById(reviewId);
        } else {
            throw new IllegalStateException("reviewRepository is not initialized");
        }
    }
}
