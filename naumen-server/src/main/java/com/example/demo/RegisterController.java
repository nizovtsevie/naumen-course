package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class RegisterController {
    final UsersRepository usersRepository;

    public RegisterController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@Valid @RequestBody RegisterRequest request) {
        Users user = new Users();
        user.Fill(request.getUsername(), request.getLogin(), request.getPassword());
        usersRepository.save(user);
    }

    @GetMapping("/users")
    public Iterable<Users> getUsers() {
        return usersRepository.findAll();
    }
}
