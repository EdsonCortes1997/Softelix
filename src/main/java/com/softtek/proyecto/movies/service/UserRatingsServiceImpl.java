package com.softtek.proyecto.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.softtek.proyecto.movies.entity.UserRatings;
import com.softtek.proyecto.movies.repository.UserRatingsRepository;

public class UserRatingsServiceImpl implements UserRatingsService {

	@Autowired
	private UserRatingsRepository repository;

	@Override
	public List<UserRatings> getAllUserRatings() {
		return (List<UserRatings>) repository.findAll();
	}

	@Override
	public UserRatings getUserRatingsById (final Integer id) {
		UserRatings userrating = (UserRatings) this.repository.findById(id).orElse(null);
		return userrating;
	}

	@Override
	public UserRatings addUserRatings(UserRatings userrating) {
		return this.repository.save(userrating);
	}

	@Override
	public UserRatings updateUserRatings (UserRatings userrating) {
		return repository.save(userrating);
	}

	@Override
	public boolean deleteUserRatingsById(Integer id) {
		this.repository.deleteById(id);
		return true;
	}


	@Override
	public String getUserRatingsByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	}
