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

import com.softtek.proyecto.movies.entity.Director;
import com.softtek.proyecto.movies.service.DirectorService;
import com.softtek.proyecto.movies.service.DirectorServiceImpl;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class DirectorController {
	
	private final Logger log = LoggerFactory.getLogger(MovieController.class);

	@Autowired
	private DirectorServiceImpl directorServiceImpl;
	
	@GetMapping (value = "/directors/", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Director> getDirectorList(){
		return directorServiceImpl.getAllDirectors();
	}
	
	@GetMapping (value = "/director/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Director getDirectorById(@PathVariable("id") Integer id){
		return directorServiceImpl.getDirectorById(id);
	}
	
	@PostMapping (value = "/director/", produces = MediaType.APPLICATION_JSON_VALUE)
	public Director addMovie(@RequestBody Director requestBody){
		return directorServiceImpl.addDirector(requestBody);
	}
	
	@PutMapping(value = "/director/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	 public Director updateUser(@PathVariable("id") String director, @RequestBody Director requestBody) {
		 return directorServiceImpl.updateDirector(requestBody);
	 }
	
	@DeleteMapping(value = "/delete/director/{id}/")
	public void deleteUser(@PathVariable("id") Integer id) {
		directorServiceImpl.deleteDirectorById(id);
	}

}