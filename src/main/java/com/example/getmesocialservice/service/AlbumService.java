package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.repository.AlbumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {

    @Autowired
    AlbumRepo albumRepo;

    public Album getAlbum() {
        return albumRepo.getAlbum();
    }
   /* public Album getAlbumById(int albumId) {
        return Album;
    }*/

    public List<Album> saveAlbum(Album album) {
        return albumRepo.saveAlbum(album);
    }

    public Optional<Album> getAlbumById(int albumId) {
        return albumRepo.getAlbumbyId(albumId);
    }

    public Album updateAlbum(int albumId, Album album) {
        return albumRepo.updateAlbum(albumId,album);
    }

    public Album deleteAlbum(int albumId) {
        return albumRepo.deleteAlbum(albumId);
    }
}
