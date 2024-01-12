package com.sriram.fmsfinal.viewmodels.Flight;

import jakarta.persistence.Column;

public class CreateFlightPassengerViewModel {

    private String firstName;

    private String lastName;

    private String mobileNumber;

    private String email;

    private String flightCode;

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public String getMobileNumber () {
        return mobileNumber;
    }

    public void setMobileNumber ( String mobileNumber ) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public String getFlightCode () {
        return flightCode;
    }

    public void setFlightCode ( String flightCode ) {
        this.flightCode = flightCode;
    }
}
