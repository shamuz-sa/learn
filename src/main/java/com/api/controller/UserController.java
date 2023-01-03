package com.api.controller;

import com.api.entity.User;
import com.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers()
    {
        return userService.getUsers();
       /* return List.of(
                new User(
                        1L,
                        "toto",
                        "tokpon",
                        "toto.toto@gmail.com",
                        "Admin"
                )
        ); */
    }
}
