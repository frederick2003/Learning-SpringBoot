package com.frederick2003.userRepo;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Repository
public class InMemoryUserRepository implements UserRepository{
    private final HashMap<String, User> users = new HashMap<>();

    @Override
    public void save(User user){
        String userEmail = user.getEmail();
        System.out.println("Saving user: " + userEmail);
        users.put(userEmail, user);
    }
}
