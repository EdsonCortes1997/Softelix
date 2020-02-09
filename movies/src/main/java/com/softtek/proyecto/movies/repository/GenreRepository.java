package com.softtek.proyecto.movies.repository;

import org.springframework.data.repository.CrudRepository;

import com.softtek.proyecto.movies.entity.Genre;

public interface GenreRepository extends CrudRepository<Genre , Integer>{

}
