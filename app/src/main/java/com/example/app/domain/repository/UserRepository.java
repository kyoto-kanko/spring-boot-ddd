package com.example.app.domain.repository;

import com.example.app.domain.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    User findById(String id);
    void save(User user);
    void update(User user);
    void deleteById(String id);
}
