package com.sriram.fmsfinal.service;

import com.sriram.fmsfinal.entity.Flight;

import java.util.List;

public interface FlightService {

    List<Flight> getAllFlights();
    Flight getFlightById(long id);
    Flight getFlightByOriginCity(String city);
    Flight getFlightByDestinationCity(String city);
    List<Flight> getFlightsByMinCapacity(int capacity);

    Flight addFight(Flight flight);

    Flight updateFlight(long id, Flight flight);

    Flight deleteFlight(long id);
}
