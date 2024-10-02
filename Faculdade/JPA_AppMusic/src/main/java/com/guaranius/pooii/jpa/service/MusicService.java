package com.guaranius.pooii.jpa.service;

import com.guaranius.pooii.jpa.entity.Music;
import com.guaranius.pooii.jpa.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {
    @Autowired
    private MusicRepository musicRepository;

    public Music addMusic(Music music) {
        return musicRepository.save(music);
    }

    public List<Music> findByName(String name) {
        return musicRepository.findByName(name);
    }

    public List<Music> findByAlbumName(String albumName) {
        return musicRepository.findByAlbum_Name(albumName);
    }

    public List<Music> findByArtistName(String artistName) {
        return musicRepository.findByAlbum_Artist_Name(artistName);
    }

    public List<Music> findByGenreName(String genreName) {
        return musicRepository.findByAlbum_Genre_Name(genreName);
    }

    public List<Music> findByPlaylistName(String playlistName) {
        return musicRepository.findByPlaylists_Name(playlistName);
    }
}
