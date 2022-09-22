package com.example.getmesocialservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class Comment {
    @Id
    private String id;
    private String photoId;
    private String message;
    private String createdBy;
    private Date dateCreated;
}
