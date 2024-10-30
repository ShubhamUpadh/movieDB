package com.movieDB.MovieDB.controller;

import com.movieDB.MovieDB.entity.rating;
import com.movieDB.MovieDB.service.ratingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/ratings")
public class ratingController {

    private final ratingService ratingService;

    public ratingController(ratingService ratingService){
        this.ratingService = ratingService;
    }

    @PostMapping("/add")
    public rating addRating(@RequestBody rating rating){
        return ratingService.addRating(rating);
    }

    //Get rating by rating ID
    @GetMapping("/{id}")
    public ResponseEntity<rating> getRatingById(@PathVariable UUID Id){
        rating rating = ratingService.findById(Id);
        return rating != null ? ResponseEntity.ok(rating) : ResponseEntity.notFound().build();
    }

    //Get rating by user ID
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<rating>> getRatingByUserID(@PathVariable UUID userId){
        List<rating> ratings = ratingService.findByUserId(userId);
        return ResponseEntity.ok(ratings);
    }

    //Get rating by movie ID
    @GetMapping("/movie/{movieId}")

    public ResponseEntity<List<rating>> getRatingByMovieID(@PathVariable UUID movieId){
        List<rating> ratings = ratingService.findByMovieId(movieId);
        return ResponseEntity.ok(ratings);
    }


}
