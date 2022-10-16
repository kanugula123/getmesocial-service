package com.example.getmesocialservice.model;

import com.example.getmesocialservice.validators.ValidName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Comment")
public class Comment {
    @Id
    private String id;
    private String photoId;
    @Length(min = 5)
    private String message;
    @ValidName
    private String createdBy;
    private Date dateCreated;
}
