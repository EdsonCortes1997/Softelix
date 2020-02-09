package com.softtek.proyecto.movies.service;

import java.util.List;

import com.softtek.proyecto.movies.entity.User;



public interface UserService {
	
	public List<User> getAllUsers();

	public User getUserById(Integer id);

	public User addUser(User User);

	public User updateUser(User User);

	public boolean deleteUserById(Integer id);

	public String getUserByTitle(String title);

	

}