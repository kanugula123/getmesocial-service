package com.example.getmesocialservice.exceptions;

public class UserNotFoundException extends Exception{

    @Override
    public String getMessage() {
        return "Root user cannot be created";
    }
}
