package com.example.travelservice.service;

import java.util.List;

import com.example.travelservice.model.Destination;
import com.example.travelservice.repository.DestinationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinationService {
    private final DestinationRepository destinationRepository;

    @Autowired
    public DestinationService(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    public List<Destination> getAllDestinations() {
        return destinationRepository.findAll();
    }

    public List<Destination> getCountryDestinations(String country) {
        return destinationRepository.findByCountry(country);
    }
}
