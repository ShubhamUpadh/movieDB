package com.moviedb.movieAPI.service;

import com.moviedb.movieAPI.entity.rating_Table;
import com.moviedb.movieAPI.repository.rating_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class rating_service {
    @Autowired
    private rating_repository ratingRepository;

    public rating_Table saveRating(rating_Table rating){
        return ratingRepository.save(rating);
    }

    public Optional<rating_Table> getMovieById(UUID id){
        return ratingRepository.findById(id);
    }

    public List<rating_Table> getAllRating(){
        return ratingRepository.findAll();
    }

    public void deleteRating(UUID id){
        ratingRepository.deleteById(id);
    }
}
