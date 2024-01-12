package com.sriram.fmsfinal.repository;

import com.sriram.fmsfinal.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight,Integer> {
}
