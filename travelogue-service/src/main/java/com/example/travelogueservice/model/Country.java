package com.example.travelogueservice.model;



public class Country {
    private String id;
    private String country;

    private String capital;

    private String currency;

    private String currencysymbol;

    private String language;

    public Country()
	{
		
	}
    
    public Country(String id, String country, String capital, String currency, String currencysymbol, String language) {
        this.id=id;
        this.country=country;
        this.capital=capital;
        this.currency=currency;
        this.currencysymbol=currencysymbol;
        this.language=language;        
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

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencySymbol() {
        return currencysymbol;
    }

    public void getCurrencySymbol(String currencysymbol) {
        this.currencysymbol = currencysymbol;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
