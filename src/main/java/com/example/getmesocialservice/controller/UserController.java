package com.example.getmesocialservice.controller;

import com.example.getmesocialservice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/user")
    public User getUser() {
        User user = new User("Karthik","Toronto",29,"www.google.com");
        return user;
    }
}
