package com.sriram.fmsfinal.repository;

import com.sriram.fmsfinal.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Integer> {
}
