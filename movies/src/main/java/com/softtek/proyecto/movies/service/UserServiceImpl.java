package com.softtek.proyecto.movies.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softtek.proyecto.movies.entity.User;
import com.softtek.proyecto.movies.repository.UserRepository;




@Repository
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getUserById (final Integer id) {
		User user = (User) this.userRepository.findById(id).orElse(null);
		return user;
	}

	@Override
	public User addUser(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public User updateUser (User user) {
		return userRepository.save(user);
	}

	@Override
	public boolean deleteUserById(Integer id) {
		this.userRepository.deleteById(id);
		return true;
	}


	@Override
	public String getUserByTitle(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	}
