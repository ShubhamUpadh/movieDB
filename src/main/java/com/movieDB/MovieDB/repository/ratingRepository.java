package com.movieDB.MovieDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.movieDB.MovieDB.entity.rating;
import java.util.UUID;

public interface ratingRepository extends JpaRepository<rating, UUID> {
}