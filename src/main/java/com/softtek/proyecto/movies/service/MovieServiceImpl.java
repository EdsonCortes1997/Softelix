package com.softtek.proyecto.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softtek.proyecto.movies.entity.Movie;
import com.softtek.proyecto.movies.repository.MovieRepository;

@Repository
public class MovieServiceImpl implements MovieService {

	@Autowired

	private MovieRepository movieRepository;

	@Override
	public List<Movie> getAllMovies() {
		return (List<Movie>) movieRepository.findAll();
	}

	public Movie getMovieById(final Integer id) {
		Movie movie = this.movieRepository.findById(id).orElse(null);
		return movie;
	}

	public Movie addMovie(final Movie movie) {
		return this.movieRepository.save(movie);
	}

	public Movie updateMovie(final Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public boolean deleteMovieById(Integer id) {
		this.movieRepository.deleteById(id);
		return true;
	}



}
