package com.moviedb.movieAPI.controller;

import com.moviedb.movieAPI.entity.movie_table;
import com.moviedb.movieAPI.service.movie_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/movies")
public class movie_controller {

    @Autowired
    private movie_service movieService;

    @PostMapping
    public ResponseEntity<movie_table> createUser(@RequestBody movie_table movieTable){
        movie_table savedMovie = movieService.saveMovie(movieTable);
        return ResponseEntity.ok(savedMovie);
    }

    @GetMapping("/{id}")
    public ResponseEntity<movie_table> getMovieById(@PathVariable UUID id){
        Optional<movie_table> movieTable = movieService.getMovieById(id);
        return movieTable.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<movie_table>> getAllMovies(){
        List<movie_table> movieTables = movieService.getAllMovies();
        return ResponseEntity.ok(movieTables);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable UUID id){
        movieService.deleteMovie(id);
        return ResponseEntity.noContent().build();
    }
}
