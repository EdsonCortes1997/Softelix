package com.softtek.proyecto.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.softtek.proyecto.movies.entity.Movie;
import com.softtek.proyecto.movies.repository.MovieRepository;

public class MovieServiceImpl implements MovieService {

	@Autowired

	private MovieRepository repository;

	@Override
	public List<Movie> getAllMovies() {
		return (List<Movie>) repository.findAll();
	}

	public Movie getMovieById(final Integer id) {
		Movie movie = this.repository.findById(id).orElse(null);
		return movie;
	}

	public Movie addMovie(final Movie movie) {
		return this.repository.save(movie);
	}

	public Movie updateMovie(final Movie movie) {
		return repository.save(movie);
	}

	@Override
	public boolean deleteMovieById(Integer id) {
		this.repository.deleteById(id);
		return true;
	}

	@Override
	public String getMovieByTitle(String title) {
 		return null;
	}

}
