package com.neosoft.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.main.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);

}
