package com.movieDB.MovieDB.entity;

import jakarta.persistence.*;

import java.util.UUID;


@Entity
@Table(name = "user_account")
public class userAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name")
    private String name;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
