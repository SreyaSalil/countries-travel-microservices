package com.example.travelogueservice.model;

import java.util.List;


public class TravelItem {

    private String country;

    private String capital;
    private String language;
    private List<DestinationList> dests;

    public TravelItem()
	{
		
	}
    
    public TravelItem(String country, String capital, String language, List<DestinationList> dests) {
        this.country=country;
        this.capital=capital;
        this.language=language; 
        this.dests=dests;       
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<DestinationList> getDestinations() {
        return dests;
    }

    public void setDestinations(List<DestinationList> dests) {
        this.dests = dests;
    }

}
