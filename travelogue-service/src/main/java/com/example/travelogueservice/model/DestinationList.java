package com.example.travelogueservice.model;

public class DestinationList {
    private String destination;

    private String location;

    public DestinationList() {
    }

    public DestinationList(String destination, String location) {
        this.destination=destination;
        this.location=location;
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
}
