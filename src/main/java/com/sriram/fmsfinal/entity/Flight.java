package com.sriram.fmsfinal.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String flightCode;

    private String origin;

    private String destination;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime flightTime;

    private int capacity;

    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
    private List<Passenger> passengers;

}
