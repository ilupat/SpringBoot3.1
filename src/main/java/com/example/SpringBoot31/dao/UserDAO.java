package com.example.SpringBoot31.dao;



import com.example.SpringBoot31.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    void save(User user);

    void delete(User user);

    void edit(User user);

    User getById(long id);
}
