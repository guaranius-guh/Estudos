package com.guaranius.pooii.jpa.service;

import com.guaranius.pooii.jpa.entity.Music;
import com.guaranius.pooii.jpa.entity.Playlist;
import com.guaranius.pooii.jpa.repository.MusicRepository;
import com.guaranius.pooii.jpa.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {
    @Autowired
    private PlaylistRepository playlistRepository;

    @Autowired
    private MusicRepository musicRepository;

    public Playlist addPlaylist(Playlist playlist) {
        return playlistRepository.save(playlist);
    }

    public List<Playlist> findAllPlaylists() {
        return playlistRepository.findAll();
    }

    public Playlist addMusicToPlaylist(Long playlistId, Long musicId) {
        Playlist playlist = playlistRepository.findById(playlistId)
                .orElseThrow(() -> new RuntimeException("Playlist not found"));

        Music music = musicRepository.findById(musicId)
                .orElseThrow(() -> new RuntimeException("Music not found"));

        playlist.getMusics().add(music);
        return playlistRepository.save(playlist);
    }
}
