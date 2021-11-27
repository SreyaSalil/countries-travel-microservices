package com.example.travelogueservice.model;



public class Destination {
    
    private String id;

    private String country;

    private String destination;

    private String location;
 
    private String maps;
    
    public Destination()
	{
		
	}
    
    public Destination(String id, String country, String destination, String location, String maps) {
        this.id=id;
        this.country=country;
        this.destination=destination;
        this.location=location;
        this.maps=maps;        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMaps() {
        return maps;
    }

    public void setMaps(String maps) {
        this.maps = maps;
    }

}
