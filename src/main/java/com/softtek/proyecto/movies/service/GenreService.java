package com.softtek.proyecto.movies.service;

import java.util.List;

import com.softtek.proyecto.movies.entity.Genre;



public interface GenreService {
	
	public List<Genre> getAllGenres();

	public Genre getGenrebyId (Integer id);

	public Genre addGenre (Genre Genre);

	public Genre updateGenre (Genre Genre);

	public boolean deleteGenre (Integer id);

	public String getGenreByTitle(String title);

}