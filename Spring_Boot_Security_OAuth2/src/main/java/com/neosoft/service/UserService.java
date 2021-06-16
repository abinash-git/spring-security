package com.neosoft.service;


import java.util.List;

import com.neosoft.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}