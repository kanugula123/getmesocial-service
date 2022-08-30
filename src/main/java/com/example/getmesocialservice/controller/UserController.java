package com.example.getmesocialservice.controller;

import com.example.getmesocialservice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/user")
    public String getUser() {
<<<<<<< HEAD
=======
        System.out.println("User");
<<<<<<< HEAD
>>>>>>> origin/master
=======
        System.out.println("Hello");
>>>>>>> origin/master
        return "User Information";
    }
}
