package com.moviedb.movieAPI.repository;

import com.moviedb.movieAPI.entity.rating_table;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface rating_repository extends JpaRepository<rating_table,UUID>{
}