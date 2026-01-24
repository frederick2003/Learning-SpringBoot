package com.frederick2003.userRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final NotificationService notificationService;


    public UserService(UserRepository userRepository, NotificationService notificationService){
        this.userRepository=userRepository;
        this.notificationService=notificationService;
    }

    public void registerUser(User user){
        userRepository.save(user);
        notificationService.send("Your email has been setup correctly", user.getEmail());
    }
}
