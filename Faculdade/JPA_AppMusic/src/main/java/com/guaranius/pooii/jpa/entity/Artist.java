package com.guaranius.pooii.jpa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArtist;
    private String name;
    private String nationality;

    @OneToMany
    @JoinColumn(name = "id_artist")
    private List<Album> albums;

    public Artist() {

    }

    public Long getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(Long idArtist) {
        this.idArtist = idArtist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
