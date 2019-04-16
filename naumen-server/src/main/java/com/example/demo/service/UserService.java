package com.example.demo.service;

import com.example.demo.entity.User;
import java.util.List;

public interface UserService {

    User addUser(User user);
    void delete(long uid);
    User editUser(User user);
    List<User> getAll();

}