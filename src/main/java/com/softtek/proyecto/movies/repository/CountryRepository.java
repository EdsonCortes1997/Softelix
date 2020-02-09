package com.softtek.proyecto.movies.repository;

import org.springframework.data.repository.CrudRepository;

import com.softtek.proyecto.movies.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Integer>{

}
