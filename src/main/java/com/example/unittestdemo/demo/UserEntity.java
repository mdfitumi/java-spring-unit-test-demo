package com.example.unittestdemo.demo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Date createdAt;
}
