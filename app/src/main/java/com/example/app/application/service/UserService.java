package com.example.app.application.service;

import com.example.app.domain.model.User;
import com.example.app.domain.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(String id) {
        User user = userRepository.findById(id);
        return Optional.ofNullable(user);
    }
}
