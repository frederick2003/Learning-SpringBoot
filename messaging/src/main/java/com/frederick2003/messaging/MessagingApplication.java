package com.frederick2003.messaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MessagingApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MessagingApplication.class, args);
		NotificationManager manager = context.getBean(NotificationManager.class);
		manager.sendNotification("Hello World!");
	}

}
