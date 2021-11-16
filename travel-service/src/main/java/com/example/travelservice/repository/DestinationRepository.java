package com.example.travelservice.repository;

import java.util.List;

import com.example.travelservice.model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, String> {
    List<Destination> findByCountry(String country);
}
