package com.frederick2003.userRepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UserRepoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(UserRepoApplication.class, args);
		UserService service = context.getBean(UserService.class);
		service.registerUser(new User("John Doe","JohnDoe@gmail.com","0874447481"));
	}
}
