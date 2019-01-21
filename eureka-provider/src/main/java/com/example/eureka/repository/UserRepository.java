package com.example.eureka.repository;


import com.example.eureka.model.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UserRepository {

    private ConcurrentHashMap<Long, User> userConcurrentHashMap=new ConcurrentHashMap<>();

    private AtomicLong id=new AtomicLong();
    private Long generateId(){
        return id.incrementAndGet();
    }
    public Boolean addUser(User user) {
        Long id = generateId();
        user.setId(id);
        userConcurrentHashMap.put(id, user);
        return user!=null;
    }

    public Collection<User> findAll() {
        return userConcurrentHashMap.values();
    }
}
