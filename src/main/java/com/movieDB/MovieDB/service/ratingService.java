package com.movieDB.MovieDB.service;

import com.movieDB.MovieDB.entity.rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movieDB.MovieDB.repository.ratingRepository;

import java.util.List;
import java.util.UUID;

public interface ratingService {


    public rating addRating(rating rating);
    rating findById(UUID Id);
    List<rating> findByUserId(UUID userId);
    List<rating> findByMovieId(UUID movieId);


}
