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

    @GetMapping("/album")
    public Album getAlbum() {
        return albumService.getAlbum();
    }

//    @RequestMapping(value = "/album/{albumId}", method = RequestMethod.GET)
    @GetMapping("/album/{albumId}")
    public Optional<Album> getAlbumById(@PathVariable(value = "albumId") int albumId) {
        return albumService.getAlbumById(albumId);
    }

    @PostMapping("/save-album")
    public List<Album> saveAlbum(@RequestBody Album album) {
        return albumService.saveAlbum(album);
    }

    @PutMapping("/album/{albumId}")
    public Album updateAlbum(@PathVariable(value = "albumId") int albumId, @RequestBody Album album) {
        return albumService.updateAlbum(albumId, album);
    }

    @DeleteMapping("/album")
    public Album deleteAlbum(@RequestParam(name="albumId") int albumId) {
        return albumService.deleteAlbum(albumId);
    }
}
