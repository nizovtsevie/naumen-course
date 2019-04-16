package com.server.Requests;


import javax.validation.constraints.NotNull;

public class RegisterRequest {
    @NotNull
    private String username;

    @NotNull
    private String login;

    @NotNull
    private String password;

    public String getUsername() {
        return this.username;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }
}
