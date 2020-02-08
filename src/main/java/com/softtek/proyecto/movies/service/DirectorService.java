package com.softtek.proyecto.movies.service;

import java.util.List;

import com.softtek.proyecto.movies.entity.Director;

public interface DirectorService {
	
	public List<Director> getAllDirectors();

	public Director getDirectorById(Integer id);

	public Director addDirector(Director Director);

	public Director updateDirector(Director Director);

	public boolean deleteDirectorById(Integer id);

	public String getDirectorByTitle(String title);

}
