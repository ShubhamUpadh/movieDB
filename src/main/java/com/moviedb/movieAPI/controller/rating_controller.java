package com.moviedb.movieAPI.controller;

import com.moviedb.movieAPI.entity.rating_Table;
import com.moviedb.movieAPI.service.rating_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/ratings")
public class movie_controller {

    @Autowired
    private rating_service ratingService;

    @PostMapping
    public ResponseEntity<rating_Table> createRating(@RequestBody rating_Table ratingTable){
        rating_Table savedRating = ratingService.saveRating(ratingTable);
        return ResponseEntity.ok(savedRating);
    }

    @GetMapping("/{id}")
    public ResponseEntity<rating_Table> getRatingById(@PathVariable UUID id){
        Optional<rating_Table> ratingTable = ratingService.getRatingById(id);
        return ratingTable.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<rating_Table>> getAllRatings(){
        List<rating_Table> ratingTables = ratingService.getAllRating();
        return ResponseEntity.ok(ratingTables);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRating(@PathVariable UUID id){
        ratingService.deleteRating(id);
        return ResponseEntity.noContent().build();
    }
}
