package com.flyhub.lightbulb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyhub.lightbulb.models.Country;
import com.flyhub.lightbulb.repository.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository CountryRepository;
	
	
	public List<Country> getAllCountrys(){
		
		return CountryRepository.findAll();
	}
	
	public Country addCountry(Country Country) {
		
		return CountryRepository.save(Country);
	}
	
	public Optional<Country> getCountryById(Integer CountryId){
		
		return CountryRepository.findById(CountryId);
	}
	
	public void deleteCountry(Integer CountryId) {
		
		CountryRepository.deleteById(CountryId);
	}

}
