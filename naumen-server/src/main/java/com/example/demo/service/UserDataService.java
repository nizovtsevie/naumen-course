package com.example.demo.service;

import com.example.demo.entity.UserData;
import java.util.List;

public interface UserDataService {

    User addUserData(UserData userData);
    void delete(long uid);
    User editUserData(UserData userData);
    List<UserData> getAll();

}