package com.example.eureka.service;


import com.example.eureka.model.User;
import com.example.eureka.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public Boolean addUser(User user) {
        return userRepository.addUser(user);
    }

    @Override
    public Collection<User> findAll() {
        return userRepository.findAll();
    }
}
