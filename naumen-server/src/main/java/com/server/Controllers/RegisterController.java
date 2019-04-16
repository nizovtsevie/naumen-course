package com.server.Controllers;

import com.server.Requests.RegisterRequest;
import com.server.Entities.User;
import com.server.UsersRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/register")
public class RegisterController {
    final UsersRepository usersRepository;

    public RegisterController(UsersRepository repository) {
        this.usersRepository = repository;
    }

    @PostMapping("/adduser")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser( @Valid @RequestBody RegisterRequest request) {
        User profile = new User(request.getUsername(), request.getLogin(), request.getPassword());
        usersRepository.save(profile);
    }

    @GetMapping("/users")
    public Iterable<User> getUsers() {
        return usersRepository.findAll();
    }
}
