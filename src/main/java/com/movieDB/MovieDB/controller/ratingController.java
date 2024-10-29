package com.movieDB.MovieDB.controller;

import com.movieDB.MovieDB.entity.rating;
import com.movieDB.MovieDB.service.ratingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class ratingController {

    @Autowired
    private ratingService ratingService;

    @PostMapping("/add")
    public rating addRating(@RequestBody rating rating){
        return ratingService.addRating(rating);
    }
}
