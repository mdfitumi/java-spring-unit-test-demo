package com.example.unittestdemo.demo;

import com.example.unittestdemo.demo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository users;

    @Override
    public Optional<UserEntity> findUserByName(String name) {
        return users.findUserByName(name);
    }

    @Override
    public void deleteUser(Integer userId) {
        users.deleteById(userId);
    }
}
