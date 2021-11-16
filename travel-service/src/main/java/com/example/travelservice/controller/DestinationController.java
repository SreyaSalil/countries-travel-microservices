package com.example.travelservice.controller;

import com.example.travelservice.service.DestinationService;
import com.example.travelservice.model.Destination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/travel")
@RestController
public class DestinationController {

    private final DestinationService destinationService;

    @Autowired
    public DestinationController(DestinationService destinationService) {
        this.destinationService = destinationService;
    }

    @GetMapping(value = "/getAll", produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<Destination> getAll() {
        return destinationService.getAllDestinations();
    }

    @GetMapping(value = "/{country}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<Destination> getAllCountryDestinations(@PathVariable String country) {
        return destinationService.getCountryDestinations(country);
    }
    
}














