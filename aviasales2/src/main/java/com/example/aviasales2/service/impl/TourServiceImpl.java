package com.example.aviasales2.service.impl;

import com.example.aviasales2.entity.Tour;
import com.example.aviasales2.entity.transferObjects.TourDTO;
import com.example.aviasales2.repository.TourRepository;
import com.example.aviasales2.service.TourService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TourServiceImpl implements TourService {
    @Autowired
    TourRepository tourRepository;
    @Autowired
    DozerBeanMapper mapper;

    @Override
    public Tour save(Tour tour) {
        return tourRepository.save(tour);
    }

    @Override
    public List<TourDTO> findAll() {
        return tourRepository.findAll().stream().map(entity -> mapper.map(entity, TourDTO.class)).collect(Collectors.toList());
    }

    @Override
    public Tour findByName(String name) {
        return tourRepository.findByName(name);
    }

    @Override
    public Tour deleteById(long id) {
        return tourRepository.deleteById(id);
    }

    @Override
    public void update(Tour tour) {
        tourRepository.save(tour);
    }

    @Override
    public Tour findByTourId(long id) {
        Tour obj = tourRepository.findById(id).get();
        return obj;
    }
}
