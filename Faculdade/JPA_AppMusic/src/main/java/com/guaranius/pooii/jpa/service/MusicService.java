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
}
