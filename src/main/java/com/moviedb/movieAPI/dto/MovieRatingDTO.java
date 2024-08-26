package com.moviedb.movieAPI.dto;

public class MovieRatingDTO {
    private String title;
    private double averageRating;

    public MovieRatingDTO(String title, double averageRating){
        this.title = title;
        this.averageRating = averageRating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }
}
