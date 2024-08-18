package com.moviedb.movieAPI.service;

import com.moviedb.movieAPI.entity.movie_table;
import com.moviedb.movieAPI.repository.movie_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class movie_service {
    @Autowired
    private movie_repository movieRepository;

    public movie_table saveMovie(movie_table movie){
        return movieRepository.save(movie);
    }

    public Optional<movie_table> getMovieById(UUID id){
        return movieRepository.findById(id);
    }

    public List<movie_table> getAllMovies(){
        return movieRepository.findAll();
    }

    public void deleteMovie(UUID id){
        movieRepository.deleteById(id);
    }
}
