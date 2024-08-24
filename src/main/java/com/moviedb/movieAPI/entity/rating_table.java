package com.moviedb.movieAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.UUID;

@Entity
public class rating_table {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private user_table user;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private movie_table movie;

    private int rating;

    public rating_table() {
    }

    public rating_table(user_table user, movie_table movie, int rating) {
        //this.id = UUID.randomUUID();
        this.user = user;
        this.movie = movie;
        this.rating = rating;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public user_table getUser() {
        return user;
    }

    public void setUser(user_table user) {
        this.user = user;
    }

    public movie_table getMovie() {
        return movie;
    }

    public void setMovie(movie_table movie) {
        this.movie = movie;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
