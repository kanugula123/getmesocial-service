package com.example.getmesocialservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityScan
@Document(collection = "users")
public class Users {

    @Id
    private String id;
    private String name;
    @Email
    private String email;
    @NotEmpty(message = "Profile photo url cannot be empty")
    private String profilePhotoUrl;
}
