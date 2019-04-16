package com.example.demo.service.impl;

import com.example.demo.entity.UserData;
import com.example.demo.repository.UserDataRepository;
import com.example.demo.service.UserDataService;
import org.springframework.stereotype.Service;

import java.util.List;

public class UserDataServiceImpl implements UserDataService{

    @Autowired
    private UserDataRepository userDataRepository;

    @Override
    UserData addUserData(UserData userData) {
        return userDataRepository.saveAndFlush(userData);
    }

    @Override
    public void delete(long uid) {
        userDataRepository.delete(uid);
    }

    @Override
    public UserData editUserData(UserData userData) {
        return userDataRepository.saveAndFlush(userData);
    }

    @Override
    public List<UserData> getAll() {
        return userDataRepository.findAll();
    }
}