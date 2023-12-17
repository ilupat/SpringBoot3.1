package com.example.SpringBoot31.service;


import com.example.SpringBoot31.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void save(User user);

    void delete(User user);

    void edit(User user);

    User getById(long id);
}
