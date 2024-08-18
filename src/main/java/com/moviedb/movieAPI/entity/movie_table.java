package com.moviedb.movieAPI.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class movie_table {
    @Id
    private UUID id;
    private String title;
    private String description;
    private Date release_date;
    private String genre;

    public movie_table(){}


    public movie_table(String title, String description, Date release_date, String genre) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.release_date = release_date;
        this.genre = genre;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
