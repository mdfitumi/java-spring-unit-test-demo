package com.example.unittestdemo.demo;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository {
    Optional<UserEntity> findUserByName(String name);
}
