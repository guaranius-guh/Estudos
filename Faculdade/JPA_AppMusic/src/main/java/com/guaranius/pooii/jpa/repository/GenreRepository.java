package com.guaranius.pooii.jpa.repository;

import com.guaranius.pooii.jpa.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
