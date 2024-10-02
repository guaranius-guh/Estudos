package com.guaranius.pooii.jpa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMusic;
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_album")
    private Album album;

    public Music() {

    }

    public Long getIdMusic() {
        return idMusic;
    }

    public void setIdMusic(Long idMusic) {
        this.idMusic = idMusic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
