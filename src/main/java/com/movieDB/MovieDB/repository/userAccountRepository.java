package com.movieDB.MovieDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.movieDB.MovieDB.entity.userAccount;
import java.util.UUID;

public interface userAccountRepository extends JpaRepository<userAccount, UUID> {
}