package com.work.taskflow.manager.entity;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int empId;

    @Column(name = "username")
    private String userName;

    private String password;
}
