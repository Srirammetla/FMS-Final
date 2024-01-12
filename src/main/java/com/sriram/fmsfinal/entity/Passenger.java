package com.sriram.fmsfinal.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String mobileNumber;

    @Column(unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    @NotNull
    private Flight flight;
}
