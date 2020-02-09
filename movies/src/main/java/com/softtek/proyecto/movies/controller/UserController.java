package com.softtek.proyecto.movies.controller;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.softtek.proyecto.movies.entity.User;
import com.softtek.proyecto.movies.service.UserService;
import com.softtek.proyecto.movies.service.UserServiceImpl;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class UserController {
	
	private final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserServiceImpl userServiceImpl;
	
	
	@GetMapping (value = "/users/", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUserList(){
		return userServiceImpl.getAllUsers();
	}
	
	@GetMapping (value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserById(@PathVariable("id") Integer id){
		return userServiceImpl.getUserById(id);
	}
	
	@PostMapping (value = "/user/", produces = MediaType.APPLICATION_JSON_VALUE)
	public User addUser(@RequestBody User requestBody){
		return userServiceImpl.addUser(requestBody);
	}
	
	@PutMapping(value = "/user/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	 public User updateUser(@PathVariable("id") String username, @RequestBody User requestBody) {
		 return userServiceImpl.updateUser(requestBody);
	 }
	
	@DeleteMapping(value = "/delete/user/{id}/")
	public void deleteUser(@PathVariable("id") Integer id) {
		userServiceImpl.deleteUserById(id);
	}

}
