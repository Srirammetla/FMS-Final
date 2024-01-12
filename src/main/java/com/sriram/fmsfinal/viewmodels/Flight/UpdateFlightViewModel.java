package com.sriram.fmsfinal.viewmodels.Flight;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class UpdateFlightViewModel {

    private String origin;

    private String destination;

    private LocalDateTime flightTime;

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
}
