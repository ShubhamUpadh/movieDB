package com.moviedb.movieAPI.service;

import com.moviedb.movieAPI.entity.user_table;
import com.moviedb.movieAPI.repository.user_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class user_service {

    @Autowired
    private user_repository userRepository;

    public user_table saveUser(user_table user){
        return userRepository.save(user);
    }

    public Optional<user_table> getUserById(UUID id){
        return userRepository.findById(id);
    }

    public List<user_table> getAllUsers(){
        return userRepository.findAll();
    }

    public void deleteUser(UUID id){
        userRepository.deleteById(id);
    }
}
