package com.neosoft.main;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.neosoft.main.entity.User;
import com.neosoft.main.repository.UserRepository;

@SpringBootApplication
public class StudentApiApplication {
	
	@Autowired
	UserRepository userRepository;

//	@PostConstruct
//	public void initUser() {
//		List<User> users = Stream.of(
//				new User(1, "abinash", "abinash"),
//				new User(2, "admin", "admin"),
//				new User(3, "user", "user"),
//				new User(4, "editor", "editor")
//				).collect(Collectors.toList());
//		
//		userRepository.saveAll(users);
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(StudentApiApplication.class, args);
	}

}
