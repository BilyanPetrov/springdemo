package com.example.demo.controller;


import com.example.demo.model.Albums;
import com.example.demo.service.AlbumsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// "/albums"
@RestController
@RequestMapping("/albums")
public class AlbumController {

    private final AlbumsService albumsService;

    public AlbumController(AlbumsService albumsService){
        this.albumsService = albumsService;
    }

    @GetMapping
    List<Albums> getAllAlbums(){
        return albumsService.getAllAlbums();
    }

    @GetMapping("/{id}")
    Albums getAlbum(@PathVariable Integer id){
        return albumsService.getAlbum(id);
    }

    @PostMapping
    Albums createAlbum(@RequestBody Albums albumToBeCreated){
        albumsService.createAlbum(albumToBeCreated);
        return albumToBeCreated;
    }

    @DeleteMapping("/{id}")
    void deleteAlbum(@PathVariable Integer id){
        albumsService.deleteAlbum(id);
    }

}
