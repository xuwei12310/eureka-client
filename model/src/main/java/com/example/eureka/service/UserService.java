package com.example.eureka.service;

import com.example.eureka.model.User;

import java.util.Collection;

public interface UserService {

    public Boolean addUser(User user);

    public Collection<User> findAll();
}
