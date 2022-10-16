package com.example.getmesocialservice.controller;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api1")
@Validated
public class AlbumController {

    @Autowired
    AlbumService albumService;

    @GetMapping("/album/{albumId}")
    public Optional<Album> getAlbum(@PathVariable(value="albumId") String albumId) {
        return albumService.getAlbum(albumId);
    }

//    @RequestMapping(value = "/album/{albumId}", method = RequestMethod.GET)
    @GetMapping("/album")
    public List<Album> getAllAlbums() {
        return albumService.getAlbums();
    }

    @PostMapping("/save-album")
    public Album saveAlbum(@RequestBody @Valid Album album) {
        return albumService.saveAlbum(album);
    }

    @PutMapping("/album")
    public ResponseEntity<Album> updateAlbum(@RequestBody @Valid Album album) {
        if(album != null) {
            Album album1 = albumService.updateAlbum(album);
            return new ResponseEntity(album1, HttpStatus.OK);
        } else {
            return new ResponseEntity(Valid.class, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/album")
    public String deleteAlbum(@RequestParam(name="albumId") String albumId) {
        albumService.deleteAlbum(albumId);
        return "Album with " + albumId + " is deleted";
    }
}
