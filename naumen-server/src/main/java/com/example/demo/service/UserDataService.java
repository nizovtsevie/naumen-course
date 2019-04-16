package com.example.demo.service;

import com.example.demo.entity.UserData;
import java.util.List;

public interface UserDataService {

    UserData addUserData(UserData userData);
    void delete(long uid);
    UserData editUserData(UserData userData);
    List<UserData> getAll();

}