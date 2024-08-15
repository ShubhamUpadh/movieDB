package com.moviedb.movieAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.UUID;

@Entity
public class rating_Table {
    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private user_table user;


    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private movie_table movie;

    private int rating;
}
