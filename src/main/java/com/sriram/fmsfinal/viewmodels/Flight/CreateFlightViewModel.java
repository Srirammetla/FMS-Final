package com.sriram.fmsfinal.viewmodels.Flight;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class CreateFlightViewModel {

    private String flightCode;

    private String origin;

    private String destination;

    private LocalDateTime flightTime;

    private int capacity;

    public String getFlightCode () {
        return flightCode;
    }

    public void setFlightCode ( String flightCode ) {
        this.flightCode = flightCode;
    }

    public String getOrigin () {
        return origin;
    }

    public void setOrigin ( String origin ) {
        this.origin = origin;
    }

    public String getDestination () {
        return destination;
    }

    public void setDestination ( String destination ) {
        this.destination = destination;
    }

    public LocalDateTime getFlightTime () {
        return flightTime;
    }

    public void setFlightTime ( LocalDateTime flightTime ) {
        this.flightTime = flightTime;
    }

    public int getCapacity () {
        return capacity;
    }

    public void setCapacity ( int capacity ) {
        this.capacity = capacity;
    }
}
