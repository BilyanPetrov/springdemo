package com.example.demo.service;

import com.example.demo.model.Albums;
import com.example.demo.repository.AlbumsRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlbumsService {

    private final AlbumsRepository albumsRepository;

    public AlbumsService(AlbumsRepository albumsRepository){
        this.albumsRepository = albumsRepository;
    }

    public Albums getAlbum(Integer id){
        return albumsRepository.getOne(id);
    }

    public void deleteAlbum(Integer id){
        albumsRepository.deleteById(id);
    }

    public void createAlbum(Albums album){
        albumsRepository.saveAndFlush(album);
    }

    public List<Albums> getAllAlbums(){
        return albumsRepository.findAll();
    }

}
