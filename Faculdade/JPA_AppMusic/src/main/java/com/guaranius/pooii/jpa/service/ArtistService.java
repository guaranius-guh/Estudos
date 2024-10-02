package com.guaranius.pooii.jpa.service;

import com.guaranius.pooii.jpa.entity.Artist;
import com.guaranius.pooii.jpa.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {
    @Autowired
    private ArtistRepository artistRepository;

    public Artist addArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    public List<Artist> findAllArtists() {
        return artistRepository.findAll();
    }
}
