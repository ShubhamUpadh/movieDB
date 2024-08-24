package com.moviedb.movieAPI.service;

import com.moviedb.movieAPI.entity.rating_table;
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

    public rating_table saveRating(rating_table rating){
        return ratingRepository.save(rating);
    }

    public Optional<rating_table> getRatingById(UUID id){
        return ratingRepository.findById(id);
    }

    public List<rating_table> getAllRating(){
        return ratingRepository.findAll();
    }

    public void deleteRating(UUID id){
        ratingRepository.deleteById(id);
    }
}
