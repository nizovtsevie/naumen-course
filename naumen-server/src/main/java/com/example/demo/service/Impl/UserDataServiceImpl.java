package com.devcolibri.dataexam.service.impl;

import com.example.demo.entity.UserData;
import com.example.demo.repository.UserDataRepository;
import com.example.demo.service.UserDataService;
import org.springframework.stereotype.Service;

import java.util.List;

public class UserDataServiceImpl implements UserDataService{

    @Autowired
    private UserDataRepository userDataRepository;

    @Override
    User addUserData(UserData userData) {
        return userDataRepository.saveAndFlush(userData);
    }

    @Override
    public void delete(long id) {
        userDataRepository.delete(id);
    }

    @Override
    public User editUserData(UserData userData) {
        return userDataRepository.saveAndFlush(userData);
    }

    @Override
    public List<UserData> getAll() {
        return userDataRepository.findAll();
    }
}