package com.movieDB.MovieDB.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "rating")
public class rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private userAccount user;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private movie movie;

    @Column(name = "rating")
    private Short rating;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public userAccount getUser() {
        return user;
    }

    public void setUser(userAccount user) {
        this.user = user;
    }

    public com.movieDB.MovieDB.entity.movie getMovie() {
        return movie;
    }

    public void setMovie(com.movieDB.MovieDB.entity.movie movie) {
        this.movie = movie;
    }

    public Short getRating() {
        return rating;
    }

    public void setRating(Short rating) {
        this.rating = rating;
    }
}
