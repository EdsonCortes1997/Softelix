package com.softtek.proyecto.movies.service;

import java.util.List;

import com.softtek.proyecto.movies.entity.UserRatings;



public interface UserRatingsService {
	
	public List<UserRatings> getAllUserRatings();

	public UserRatings getUserRatingsById(Integer id);

	public UserRatings addUserRatings(UserRatings UserRatings);

	public UserRatings updateUserRatings(UserRatings UserRatings);

	public boolean deleteUserRatingsById(Integer id);

	public String getUserRatingsByTitle(String title);

}