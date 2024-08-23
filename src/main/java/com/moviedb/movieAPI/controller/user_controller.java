package com.moviedb.movieAPI.controller;

import com.moviedb.movieAPI.entity.user_table;
import com.moviedb.movieAPI.service.user_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class user_controller {

    @Autowired
    private user_service userService;

    @PostMapping
    public ResponseEntity<user_table> createUser(@RequestBody user_table userTable){
        user_table savedUser = userService.saveUser(userTable);
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping("/{id}")
    public ResponseEntity<user_table> getUserById(@PathVariable UUID id){
        Optional<user_table> userTable = userService.getUserById(id);
        return userTable.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<user_table>> getAllUsers(){
        List<user_table> userTables = userService.getAllUsers();
        return ResponseEntity.ok(userTables);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable UUID id){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }


}
