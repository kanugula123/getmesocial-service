package com.example.getmesocialservice.controller;

import com.example.getmesocialservice.model.Photo;
import com.example.getmesocialservice.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api2")
public class PhotoController {

    @Autowired
    PhotoService photoService;

    @GetMapping("/photo/{photoId}")
    public Optional<Photo> getPhotoById(@PathVariable(value="photoId") String photoId) {
        return photoService.getPhotoById(photoId);
    }

    @GetMapping("/photo/all-photos")
    public List<Photo> getAllPhotos() {
        return photoService.getAllPhotos();
    }

    @PostMapping("/photo/save-photo")
    public Photo savePhoto(@RequestBody @Valid Photo photo) {
        return photoService.savePhoto(photo);
    }

    @PutMapping("/photo/update-photo")
    public Photo updatePhoto(@RequestBody @Valid Photo photo) {
        return photoService.updatePhoto(photo);
    }

    @DeleteMapping("/photo/delete-photo")
    public String deletePhoto(@PathVariable(value="photoId") String photoId) {
        photoService.deletePhoto(photoId);
        return "Photo with " + photoId + " is deleted";
    }

}
