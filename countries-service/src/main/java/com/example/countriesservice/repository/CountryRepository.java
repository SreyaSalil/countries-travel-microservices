package com.example.countriesservice.repository;

import com.example.countriesservice.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    Country findByCountry(String country);
}
