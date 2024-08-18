package com.moviedb.movieAPI.repository;

import com.moviedb.movieAPI.entity.user_table;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface user_repository extends JpaRepository<user_table,UUID>{
}