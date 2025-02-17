package com.spring.security.service;

import com.spring.security.entity.User;

import java.util.List;

public interface UserService {

    User register(User user);
    List<User> getAllUsers();
}
