package com.guaranius.pooii.jpa.controller;

import com.guaranius.pooii.jpa.entity.Album;
import com.guaranius.pooii.jpa.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    @PostMapping
    public ResponseEntity<Album> addAlbum(@RequestBody Album album) {
        return ResponseEntity.ok(albumService.addAlbum(album));
    }

    @GetMapping
    public ResponseEntity<List<Album>> getAllAlbums() {
        return ResponseEntity.ok(albumService.findAllAlbums());
    }
}
