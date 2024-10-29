package com.movieDB.MovieDB.service;

import com.movieDB.MovieDB.entity.rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movieDB.MovieDB.repository.ratingRepository;

@Service
public class ratingService {

    @Autowired
    private ratingRepository ratingRepository;

    public rating addRating(rating rating){
        return ratingRepository.save(rating);
    }

}
