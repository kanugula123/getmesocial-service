package com.example.getmesocialservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Album {

    private int albumId;
    private String name;
    private String description;
    private String coverPicUrl;

}
