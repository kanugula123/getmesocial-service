package com.example.getmesocialservice.controller;

import com.example.getmesocialservice.model.Users;
//import com.example.getmesocialservice.service.AlbumService;
import com.example.getmesocialservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    /*@GetMapping("/user")
    public User getUser() {
        return userService.getUser();
    }*/

    @PostMapping("/save-user")
    public Users saveUser(@RequestBody Users user) {
        return userService.saveUser(user);
    }

    @GetMapping("/get-user/{userId}")
    public Optional<Users> getUser(@PathVariable(value="userId") String userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("/get-All-Users")
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete-user")
    public String deleteUser(String userId) {
        userService.deleteUser(userId);
        return "User with " + userId + "is deleted";
    }

    @PutMapping("/update-user")
    public Users updateUser(@RequestBody Users user) {
        return userService.updateUser(user);
    }

}
