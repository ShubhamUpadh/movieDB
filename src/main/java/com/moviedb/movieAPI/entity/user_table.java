package com.moviedb.movieAPI.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.util.UUID;

@Entity
public class user_table {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private UUID id;
    private String name;

    public user_table(){}

    public user_table(String name){
        //this.id = UUID.randomUUID();
        this.name = name;
    }

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
