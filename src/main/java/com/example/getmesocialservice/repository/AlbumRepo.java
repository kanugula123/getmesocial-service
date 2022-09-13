package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Album;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AlbumRepo {

    List<Album> albums = new ArrayList<>();

    public Album getAlbum() {
        Album album = new Album(1,"Season","Spring","https://www.pinterest.com/pin/268808671487228370/");
        return album;
    }

    public List<Album> saveAlbum(Album album) {
        albums.add(album);
        return albums;
    }

    public Optional<Album> getAlbumbyId(int id) {
        return albums.stream().filter(album-> album.getAlbumId() == id).findAny();
        /*for(Album album : albums) {
            if(album.getAlbumId() == id) {
                return Optional.ofNullable(album);
            }
        }*/
    }

    public Album updateAlbum(int albumId, Album album) {
        for(Album album1 : albums) {
            if(album1.getAlbumId() == albumId) {
                album1.setName(album.getName());
                album1.setDescription(album.getDescription());
                album1.setCoverPicUrl(album.getCoverPicUrl());
                return album1;
            }
        }
        return null;
    }


    public Album deleteAlbum(int albumId) {
        Album deletedAlbum = null;
        for(Album album : albums) {
            if(album.getAlbumId() == albumId) {
                deletedAlbum = album;
                albums.remove(album);
            }
        }
        return deletedAlbum;
    }
}
