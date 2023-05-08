package com.example.hw65.controllers;

import com.example.hw65.entity.User;
import com.example.hw65.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    @GetMapping("/findByUserName/{name}")
    public ResponseEntity<User> findUserByName(@PathVariable String name) {
        return new ResponseEntity<>(userService.getUserByName(name), HttpStatus.OK);
    }
    @GetMapping("/findByUserAcoount/{account}")
    public ResponseEntity<User> findUserByAccount(@PathVariable String account) {
        return new ResponseEntity<>(userService.getUserByAccount(account), HttpStatus.OK);
    }
    @GetMapping("/findByUserEmail/{email}")
    public ResponseEntity<User> findUserByEmail(@PathVariable String email) {
        return new ResponseEntity<>(userService.getUserByEmail(email), HttpStatus.OK);
    }
}
