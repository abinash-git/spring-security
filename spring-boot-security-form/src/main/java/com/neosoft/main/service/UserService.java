package com.neosoft.main.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.neosoft.main.dto.UserRegistrationDto;
import com.neosoft.main.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
