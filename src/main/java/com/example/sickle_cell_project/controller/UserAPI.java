package com.example.sickle_cell_project.controller;

import com.example.sickle_cell_project.model.User;
import com.example.sickle_cell_project.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User/API")
public class UserAPI {
    @Autowired
    private UserRepo userRepo;
    @PostMapping("/add/User")

    public ResponseEntity<?>addUser(@RequestBody User user){
        try {
            User user1=;
            return new ResponseEntity<>(user1, HttpStatus.OK);

        }catch (Exception exception){
            return new ResponseEntity<>("something went wrong", HttpStatus.BAD_REQUEST)
        }
    }
}
