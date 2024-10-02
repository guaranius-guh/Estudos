package com.guaranius.pooii.jpa.repository;

import com.guaranius.pooii.jpa.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepository extends JpaRepository<Music, Long> {
    List<Music> findByName(String name);
    List<Music> findByAlbum_Name(String albumName);
    List<Music> findByAlbum_Artist_Name(String artistName);
    List<Music> findByAlbum_Genre_Name(String genreName);
    List<Music> findByPlaylists_Name(String playlistName);
}
