package com.sriram.fmsfinal.service;

import com.sriram.fmsfinal.entity.Passenger;

import java.util.List;

public interface PassesngerService {

    List<Passenger> getPassengerByFlightId(long flightId);
    Passenger addPassenger(Passenger passenger);

}
