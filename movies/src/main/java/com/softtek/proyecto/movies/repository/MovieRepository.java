package com.softtek.proyecto.movies.repository;

import org.springframework.data.repository.CrudRepository;

import com.softtek.proyecto.movies.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer>{

}
