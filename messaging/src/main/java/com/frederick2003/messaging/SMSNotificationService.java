package com.frederick2003.messaging;

import org.springframework.stereotype.Service;

@Service
public class SMSNotificationService implements NotificationService{

    @Override
    public void send(String message){
        System.out.println("Sending SMS:" + message);
    }
}