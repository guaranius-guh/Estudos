package com.guaranius.pooii.jpa.controller;

import com.guaranius.pooii.jpa.entity.Music;
import com.guaranius.pooii.jpa.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/musics")
public class MusicController {
    @Autowired
    private MusicService musicService;

    @PostMapping
    public ResponseEntity<Music> addMusic(@RequestBody Music music) {
        return ResponseEntity.ok(musicService.addMusic(music));
    }

    @GetMapping("/search")
    public ResponseEntity<List<Music>> searchMusic(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String albumName,
            @RequestParam(required = false) String artistName,
            @RequestParam(required = false) String genreName,
            @RequestParam(required = false) String playlistName) {

        if (name != null) {
            return ResponseEntity.ok(musicService.findByName(name));
        } else if (albumName != null) {
            return ResponseEntity.ok(musicService.findByAlbumName(albumName));
        } else if (artistName != null) {
            return ResponseEntity.ok(musicService.findByArtistName(artistName));
        } else if (genreName != null) {
            return ResponseEntity.ok(musicService.findByGenreName(genreName));
        } else if (playlistName != null) {
            return ResponseEntity.ok(musicService.findByPlaylistName(playlistName));
        }

        return ResponseEntity.badRequest().build();
    }
}
