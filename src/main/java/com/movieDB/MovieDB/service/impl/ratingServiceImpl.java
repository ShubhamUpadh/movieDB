package com.movieDB.MovieDB.service.impl;

import com.movieDB.MovieDB.service.ratingService;
import org.springframework.beans.factory.annotation.Autowired;
import com.movieDB.MovieDB.repository.ratingRepository;


public class ratingServiceImpl implements ratingService {
    @Autowired
    private ratingRepository ratingRepository;

    @Override
    public rating addRating(rating rating){
        return ratingRepository.save(rating);
    }
}
