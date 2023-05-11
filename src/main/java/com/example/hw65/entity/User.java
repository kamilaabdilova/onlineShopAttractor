package com.example.hw65.entity;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @Size(min = 2, max = 25, message = "Name should not be empty")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "email")
    @NotBlank(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String email;

    @Column(name = "account")
    @Size(min = 2, max = 25, message = "Account should not be empty")
    private String account;

    @Column(name = "password")
    private String password;

}
