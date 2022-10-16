package com.example.getmesocialservice.service;

import com.example.getmesocialservice.exceptions.UserNotFoundException;
import com.example.getmesocialservice.model.Users;
import com.example.getmesocialservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users saveUser(Users user){
            return userRepository.save(user);
    }

    public Optional<Users> getUserById(String userId) {
        return userRepository.findById(userId);
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users updateUser(Users user) {
        return userRepository.save(user);
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }

    /*public User getUser() {
        User user = new User("Karthik","Toronto",29,"www.google.com");
        return user;
    }*/
}
