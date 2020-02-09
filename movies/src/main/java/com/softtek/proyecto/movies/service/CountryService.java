package com.softtek.proyecto.movies.service;

import java.util.List;


import com.softtek.proyecto.movies.entity.Country;

public interface CountryService {
	
	public List<Country> getAllCountries();

	public Country getCountryById(Integer id);

	public Country addCountry(Country Country);

	public Country updateCountry(Country Country);

	public boolean deleteCountryById(Integer id);

	public String getCountryByTitle(String country);

}
