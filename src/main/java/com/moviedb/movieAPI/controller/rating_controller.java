package com.moviedb.movieAPI.controller;

import com.moviedb.movieAPI.entity.rating_table;
import com.moviedb.movieAPI.service.rating_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/ratings")
public class rating_controller {

    @Autowired
    private rating_service ratingService;

    @PostMapping
    public ResponseEntity<rating_table> createRating(@RequestBody rating_table ratingTable){
        rating_table savedRating = ratingService.saveRating(ratingTable);
        return ResponseEntity.ok(savedRating);
    }

    @GetMapping("/{id}")
    public ResponseEntity<rating_table> getRatingById(@PathVariable UUID id){
        Optional<rating_table> ratingTable = ratingService.getRatingById(id);
        return ratingTable.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<rating_table>> getAllRatings(){
        List<rating_table> ratingTables = ratingService.getAllRating();
        return ResponseEntity.ok(ratingTables);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRating(@PathVariable UUID id){
        ratingService.deleteRating(id);
        return ResponseEntity.noContent().build();
    }
}
