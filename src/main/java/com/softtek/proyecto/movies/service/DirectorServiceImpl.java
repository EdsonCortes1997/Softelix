package com.softtek.proyecto.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.softtek.proyecto.movies.entity.Director;
import com.softtek.proyecto.movies.repository.DirectorRepository;

public class DirectorServiceImpl implements DirectorService {
	
	@Autowired

	private DirectorRepository repository;

	@Override
	public List<Director> getAllDirectors() {
		return (List<Director>) repository.findAll();
	}

	@Override
	public Director getDirectorById(final Integer id) {
		Director director = this.repository.findById(id).orElse(null);
		return director;
	}

	@Override
	public Director addDirector(Director director) {
		return this.repository.save(director);
	}

	@Override
	public Director updateDirector(Director director) {
		return repository.save(director);
	}

	@Override
	public boolean deleteDirectorById(Integer id) {
		this.repository.deleteById(id);
		return true;
	}

	@Override
	public String getDirectorByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}


}
