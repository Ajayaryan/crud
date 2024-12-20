package com.personal.restfulwebservice.service;

import com.personal.restfulwebservice.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    void deleteUser(Long userId);
}
