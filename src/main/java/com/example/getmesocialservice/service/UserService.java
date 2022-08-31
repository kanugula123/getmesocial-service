package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser() {
        User user = new User("Karthik","Toronto",29,"www.google.com");
        return user;
    }
}
