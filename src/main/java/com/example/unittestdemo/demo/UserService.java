package com.example.unittestdemo.demo;

import java.util.Optional;

public interface UserService {
    Optional<UserEntity> findUserByName(String name);
}
