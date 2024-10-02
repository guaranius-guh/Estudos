package com.guaranius.pooii.jpa.service;

import com.guaranius.pooii.jpa.entity.Favorite;
import com.guaranius.pooii.jpa.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteService {
    @Autowired
    private FavoriteRepository favoriteRepository;

    public Favorite addFavorite(Favorite favorite) {
        return favoriteRepository.save(favorite);
    }

    public List<Favorite> findAllFavorites() {
        return favoriteRepository.findAll();
    }
}
