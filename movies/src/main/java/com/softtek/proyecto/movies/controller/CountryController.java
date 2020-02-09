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

import com.softtek.proyecto.movies.entity.Country;
import com.softtek.proyecto.movies.entity.Director;
import com.softtek.proyecto.movies.entity.Movie;
import com.softtek.proyecto.movies.service.CountryService;
import com.softtek.proyecto.movies.service.CountryServiceImpl;
import com.softtek.proyecto.movies.service.DirectorService;
import com.softtek.proyecto.movies.service.MovieService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class CountryController {
	
	private final Logger log = LoggerFactory.getLogger(MovieController.class);

	@Autowired
	private CountryServiceImpl countryServiceImpl;
	
	@GetMapping (value = "/countries/", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Country> getCountryList(){
		return countryServiceImpl.getAllCountries();
	}
	
	@GetMapping (value = "/country/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Country getCountryById(@PathVariable("id") Integer id){
		return countryServiceImpl.getCountryById(id);
	}
	
	@PostMapping (value = "/country/", produces = MediaType.APPLICATION_JSON_VALUE)
	public Country addMovie(@RequestBody Country requestBody){
		return countryServiceImpl.addCountry(requestBody);
	}
	
	@PutMapping(value = "/country/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	 public Country updateUser(@PathVariable("id") String country, @RequestBody Country requestBody) {
		 return countryServiceImpl.updateCountry(requestBody);
	 }
	
	@DeleteMapping(value = "/delete/country/{id}/")
	public void deleteCountry(@PathVariable("id") Integer id) {
		countryServiceImpl.deleteCountryById(id);
	}


}