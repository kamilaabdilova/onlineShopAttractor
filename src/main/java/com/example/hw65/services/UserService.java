package com.example.hw65.services;

import com.example.hw65.entity.User;
import com.example.hw65.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class UserService {
private final UserRepository userRepository;
    public User getUserByName(String name) {
        return userRepository.findUserByName(name);
    }

    public User getUserByAccount(String account) {
        return userRepository.findUserByAccount(account);
    }

    public User getUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }
}
