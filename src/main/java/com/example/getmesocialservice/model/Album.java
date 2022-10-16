package com.example.getmesocialservice.model;

import com.example.getmesocialservice.validators.ValidName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityScan
@Document(collection = "Album")
public class Album {

    @Id
    private String id;
    @Length(max = 10)
    private String name;
    private String coverPhotoUrl;
    @ValidName
    private String createdBy;
    private Date dateCreated;
}
