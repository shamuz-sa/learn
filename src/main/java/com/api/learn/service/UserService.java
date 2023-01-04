package com.api.learn.service;

import com.api.learn.entity.User;
import com.api.learn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public List<User> getUsers()
    {
        return userRepository.findAll();
    }
}

