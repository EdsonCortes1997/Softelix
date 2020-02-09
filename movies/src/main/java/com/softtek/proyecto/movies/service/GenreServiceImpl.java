package com.softtek.proyecto.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softtek.proyecto.movies.entity.Genre;
import com.softtek.proyecto.movies.repository.GenreRepository;

@Repository
public class GenreServiceImpl implements GenreService {

	@Autowired
	private GenreRepository genreRepository;

	@Override
	public List<Genre> getAllGenres() {
		return (List<Genre>) genreRepository.findAll();
	}

	@Override
	public Genre getGenrebyId (final Integer id) {
		Genre genre = (Genre) this.genreRepository.findById(id).orElse(null);
		return genre;
	}

	@Override
	public Genre addGenre(Genre genre) {
		return this.genreRepository.save(genre);
	}

	@Override
	public Genre updateGenre(Genre genre) {
		return genreRepository.save(genre);
	}

	@Override
	public boolean deleteGenre(Integer id) {
		this.genreRepository.deleteById(id);
		return true;
	}


	@Override
	public String getGenreByTitle(String director) {
		// TODO Auto-generated method stub
		return null;
	}



	
	
	
	}
