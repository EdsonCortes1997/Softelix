package com.softtek.proyecto.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softtek.proyecto.movies.entity.Country;
import com.softtek.proyecto.movies.repository.CountryRepository;

@Repository
public class CountryServiceImpl implements CountryService {
	
	@Autowired

	private CountryRepository countryRepository;

	@Override
	public List<Country> getAllCountries() {
		return (List<Country>) countryRepository.findAll();
	}

	@Override
	public Country getCountryById(final Integer id) {
		Country country = this.countryRepository.findById(id).orElse(null);
		return country;
	}

	@Override
	public Country addCountry(Country country) {
		return this.countryRepository.save(country);
	}

	@Override
	public Country updateCountry(Country country) {
		return countryRepository.save(country);
	}

	@Override
	public boolean deleteCountryById(Integer id) {
		this.countryRepository.deleteById(id);
		return true;
	}

	@Override
	public String getCountryByTitle(String country) {
		// TODO Auto-generated method stub
		return null;
	}


}
