package com.guaranius.pooii.jpa.service;

import com.guaranius.pooii.jpa.entity.Playlist;
import com.guaranius.pooii.jpa.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistService {
    @Autowired
    private PlaylistRepository playlistRepository;

    public Playlist addPlaylist(Playlist playlist) {
        return playlistRepository.save(playlist);
    }

    public List<Playlist> findAllPlaylists() {
        return playlistRepository.findAll();
    }
}
