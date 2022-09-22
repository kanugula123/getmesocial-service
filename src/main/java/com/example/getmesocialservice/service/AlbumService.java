package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Album;
import com.example.getmesocialservice.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {

    @Autowired
    AlbumRepository albumRepo;

    public Optional<Album> getAlbum(String userId) {
        return albumRepo.findById(userId);
    }
    public List<Album> getAlbums() {
        return albumRepo.findAll();
    }

    public Album saveAlbum(Album album) {
        return albumRepo.save(album);
    }

    public Album updateAlbum(Album album) {
        return albumRepo.save(album);
    }

    public void deleteAlbum(String albumId) {
        albumRepo.deleteById(albumId);
    }
}
