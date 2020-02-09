package com.softtek.proyecto.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softtek.proyecto.movies.entity.Director;
import com.softtek.proyecto.movies.repository.DirectorRepository;

@Repository
public class DirectorServiceImpl implements DirectorService {
	
	@Autowired

	private DirectorRepository directorRepository;

	@Override
	public List<Director> getAllDirectors() {
		return (List<Director>) directorRepository.findAll();
	}

	@Override
	public Director getDirectorById(final Integer id) {
		Director director = this.directorRepository.findById(id).orElse(null);
		return director;
	}

	@Override
	public Director addDirector(Director director) {
		return this.directorRepository.save(director);
	}

	@Override
	public Director updateDirector(Director director) {
		return directorRepository.save(director);
	}

	@Override
	public boolean deleteDirectorById(Integer id) {
		this.directorRepository.deleteById(id);
		return true;
	}

	@Override
	public String getDirectorByTitle(String director) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}

