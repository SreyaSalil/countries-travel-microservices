package com.example.countriesservice.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table 
public class Country {
    @Id
    private String id;
    @Column
    private String country;
    @Column
    private String capital;
    @Column
    private String currency;
    @Column
    private String currencysymbol;
    @Column
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
