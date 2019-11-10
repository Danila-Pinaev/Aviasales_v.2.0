package com.example.aviasales2.service;

import com.example.aviasales2.entity.Trip;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

public interface TripService {
    List<Trip> findAll(String cityFrom, String cityDest, String date);
    String  save(Trip trip);
    String deleteById(long id);
    String update(Trip trip);
    Trip findById(long id);
    BigDecimal getPrice (long tripId);
    int getFullCountSeats(long tripId);
    BigDecimal calculateCost(int count, long tripId);
}
