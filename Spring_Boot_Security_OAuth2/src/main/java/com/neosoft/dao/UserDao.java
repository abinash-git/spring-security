package com.neosoft.dao;

import com.neosoft.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value="userDao")
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
