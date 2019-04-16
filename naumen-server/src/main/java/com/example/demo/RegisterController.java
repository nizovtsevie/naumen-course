package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.impl.*;
import com.example.demo.entity.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class RegisterController {

    final UserServiceImpl userServiceImpl;

    public RegisterController(UserServiceImpl userService) { this.userServiceImpl = userService;    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@Valid @RequestBody RegisterRequest request) {
        User user = new User();
        user.Fill(request.getUsername(), request.getEmail(), request.getPassword());
        userServiceImpl.addUser(user);
    }

    @GetMapping("/users")
    public Iterable<User> getUsers() { return userServiceImpl.getAll(); }
}
