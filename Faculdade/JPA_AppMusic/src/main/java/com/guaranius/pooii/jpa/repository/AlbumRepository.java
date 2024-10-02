package com.guaranius.pooii.jpa.repository;

import com.guaranius.pooii.jpa.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {

}
