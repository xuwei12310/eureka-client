package com.example.eureka.service;

import com.example.eureka.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@Service
public class UserServiceProxy implements UserService{

    private static final String SERVICE_URL="http://eureka-provider";
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public Boolean addUser(User user){
        return restTemplate.postForObject(SERVICE_URL+"/addUser",user,Boolean.class);
    }

    @Override
    public Collection<User> findAll() {
        return restTemplate.getForObject(SERVICE_URL+"/findAll",Collection.class);
    }
}
