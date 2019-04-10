package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {

    @Id
    @GeneratedValue
    public Long id;
    public String Username;
    public String Login;
    public String Password;

    public void Fill(String username, String login, String password){
        Username = username;
        Login = login;
        Password = password;
    }
}
