package com.moviedb.movieAPI.repository;

import com.moviedb.movieAPI.entity.movie_table;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface movie_repository extends JpaRepository<movie_table,UUID>{
}