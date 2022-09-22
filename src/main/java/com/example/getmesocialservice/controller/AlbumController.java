package com.example.getmesocialservice.controller;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api1")
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
    public Album saveAlbum(@RequestBody Album album) {
        return albumService.saveAlbum(album);
    }

    @PutMapping("/album/{albumId}")
    public Album updateAlbum(@RequestBody Album album) {
        return albumService.updateAlbum(album);
    }

    @DeleteMapping("/album")
    public String deleteAlbum(@RequestParam(name="albumId") String albumId) {
        albumService.deleteAlbum(albumId);
        return "Album with " + albumId + " is deleted";
    }
}
