package com.example.travelogueservice.controller;

import com.example.travelogueservice.model.TravelItem;
import com.example.travelogueservice.service.TravelogueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

@RequestMapping("/travelogue")
@RestController
public class TravelogueController {
    private final TravelogueService travelogueService;

    @Autowired
    public TravelogueController(TravelogueService travelogueService) {
        this.travelogueService = travelogueService;
    }

    @GetMapping(value = "/{country}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public TravelItem getTravelItem(@PathVariable String country) {
        return travelogueService.getTItem(country);
    }
}


