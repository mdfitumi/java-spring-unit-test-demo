package com.example.unittestdemo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService users;

    @PostMapping
    public Optional<UserEntity> findUserByName(@RequestBody String name) {
        return users.findUserByName(name);
    }
}
