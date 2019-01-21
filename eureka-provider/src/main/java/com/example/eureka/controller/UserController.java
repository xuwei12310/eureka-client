package com.example.eureka.controller;

import com.example.eureka.model.User;
import com.example.eureka.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "addUser")
    public Boolean addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @RequestMapping(value = "findAll")
    public Collection<User> findAll(){
        return userService.findAll();
    }
}
