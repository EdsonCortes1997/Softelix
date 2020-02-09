package com.softtek.proyecto.movies.repository;

import org.springframework.data.repository.CrudRepository;

import com.softtek.proyecto.movies.entity.UserRatings;

public interface UserRatingsRepository extends CrudRepository<UserRatings, Integer>{

}
