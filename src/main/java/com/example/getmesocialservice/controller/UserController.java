package com.example.getmesocialservice.controller;

import com.example.getmesocialservice.exceptions.UserNotFoundException;
import com.example.getmesocialservice.model.Users;
//import com.example.getmesocialservice.service.AlbumService;
import com.example.getmesocialservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@Validated
public class UserController {

    @Autowired
    private UserService userService;

    /*@GetMapping("/user")
    public User getUser() {
        return userService.getUser();
    }*/

    @PostMapping("/save-user")
    public Users saveUser(@RequestBody @Valid Users user) throws UserNotFoundException {
        if(user.getName().equalsIgnoreCase("root")) {
            throw new UserNotFoundException();
        }
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
    public Users updateUser(@RequestBody @Valid Users user) {
        return userService.updateUser(user);
    }

}
