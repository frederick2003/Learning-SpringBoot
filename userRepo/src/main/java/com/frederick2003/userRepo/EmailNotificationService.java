package com.frederick2003.userRepo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService{

    @Value("${email.host}")
    private String host;

    @Value("${email.port}")
    private String port;

    @Override
    public void send(String message, String recipientEmail){
        System.out.println("Email service resides on " + host + port);
        System.out.println("Sending message: " + message + " to email address: " + recipientEmail);
    }
}