package com.example.countriesservice.controller;

import com.example.countriesservice.service.CountryService;

import java.util.List;

import com.example.countriesservice.model.Country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

@RequestMapping("/countries")
@RestController
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping(value = "/getAll", produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<Country> getAll() {
        return countryService.getAllCountries();
    }

    @GetMapping(value = "/{country}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public Country getCountry(@PathVariable String country) {
        return countryService.getCountry(country);
    }
}
