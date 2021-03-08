package com.example.unittestdemo.demo;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class UserEntity {
    public Integer id;
    public String name;
    public Date createdAt;
}
