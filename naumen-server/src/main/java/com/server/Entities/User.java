package com.server.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String Username;
    private String Login;
    private String Password;

    public User(){}

    public User(String username, String login, String password) {
        Username = username;
        Login = login;
        Password = password;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return Username;
    }

    public String getLogin() {
        return Login;
    }

    public String getPassword() {
        return Password;
    }
}
