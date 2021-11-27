package com.example.travelogueservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

// import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.example.travelogueservice.model.*;

@Service
public class TravelogueService {
    @Autowired
	private RestTemplate restTemplate;

    List<DestinationList> destlist  = new ArrayList<DestinationList>();
    
	public TravelItem getTItem(String cntry) {
		Country country = restTemplate.getForObject("http://localhost:3081/countries/" + cntry, Country.class);
        ResponseEntity<Destination[]> response = restTemplate.getForEntity("http://localhost:3081/travel/" + cntry, Destination[].class);
        Destination[] dests = response.getBody();

        if(!destlist.isEmpty()){
            destlist.clear();
        }

        for(Destination d:dests){
            DestinationList dl = new DestinationList();
            dl.setDestination(d.getDestination());
            dl.setLocation(d.getLocation());
            destlist.add(dl);
        }
        
        return new TravelItem(country.getCountry(), country.getCapital() , country.getLanguage(), destlist);
	}
	

}


