package com.guaranius.pooii.jpa.controller;

import com.guaranius.pooii.jpa.entity.Playlist;
import com.guaranius.pooii.jpa.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {
    @Autowired
    private PlaylistService playlistService;

    @PostMapping
    public ResponseEntity<Playlist> addPlaylist(@RequestBody Playlist playlist) {
        return ResponseEntity.ok(playlistService.addPlaylist(playlist));
    }

    @GetMapping
    public ResponseEntity<List<Playlist>> getAllPlaylists() {
        return ResponseEntity.ok(playlistService.findAllPlaylists());
    }

    @PostMapping("/{playlistId}/addMusic/{musicId}")
    public ResponseEntity<Playlist> addMusicToPlaylist(@PathVariable Long playlistId, @PathVariable Long musicId) {
        Playlist updatedPlaylist = playlistService.addMusicToPlaylist(playlistId, musicId);
        return ResponseEntity.ok(updatedPlaylist);
    }
}
