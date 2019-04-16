package com.example.demo;


import javax.validation.constraints.NotNull;

public class RegisterRequest {
    @NotNull
    private String username;

    @NotNull
    private String email;

    @NotNull
    private String password;

    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }
}
