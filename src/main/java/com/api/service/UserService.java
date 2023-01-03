package com.api.service;

import com.api.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    public List<User> getUsers()
    {
        return List.of(
                new User(
                        1L,
                        "toto",
                        "tokpon",
                        "toto.toto@gmail.com",
                        "Admin"
                )
        );
    }
}

