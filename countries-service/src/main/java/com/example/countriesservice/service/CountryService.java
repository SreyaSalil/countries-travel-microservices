package com.example.countriesservice.service;

import java.util.List;

import com.example.countriesservice.model.Country;
import com.example.countriesservice.repository.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country getCountry(String country) {
        return countryRepository.findByCountry(country);
    }
}
