package com.spring.security.serviceImpl;

import com.spring.security.entity.User;
import com.spring.security.repository.UserRepository;
import com.spring.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return (userRepository.findAll());
    }
}
