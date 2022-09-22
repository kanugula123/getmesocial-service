package com.example.getmesocialservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.data.annotation.Id;

import javax.persistence.OneToMany;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Photo {

    @Id
    private String id;
    private String albumId;
    private String photoUrl;
    private String createdBy;
    private Date dateCreated;
}