package com.example.aviasales2.service;

import com.example.aviasales2.entity.Tour;
import com.example.aviasales2.entity.transferObjects.TourDTO;

import java.util.List;

public interface TourService {
    Tour save(Tour tour);
    void update(Tour tour);
    List<TourDTO> findAll();
    Tour findByName(String name);
    Tour findByTourId(long id);
    Tour deleteById(long id);
}