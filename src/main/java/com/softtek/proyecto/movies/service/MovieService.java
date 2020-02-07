package com.softtek.proyecto.movies.service;

import java.util.List;

import com.softtek.proyecto.movies.entity.Movie;

public interface MovieService {
	
	public List<Movie> getAllMovies();
	public Movie getMovieById(Integer id);
	public Movie addMovie(Movie Movie);
	public Movie updateMovie(Movie Movie);
	public boolean deleteMovieById(Integer id);
	public String getMovieByTitle(String title);
}
