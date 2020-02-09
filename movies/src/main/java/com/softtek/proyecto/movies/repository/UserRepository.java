package com.softtek.proyecto.movies.repository;

import org.springframework.data.repository.CrudRepository;

import com.softtek.proyecto.movies.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
