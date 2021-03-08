package com.example.unittestdemo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository users;

    @Override
    public Optional<UserEntity> findUserByName(String name) {
        return users.findUserByName(name);
    }
}
