package com.movieDB.MovieDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.movieDB.MovieDB.entity.movie;
import java.util.UUID;

public interface movieRepository extends JpaRepository<movie, UUID> {
}