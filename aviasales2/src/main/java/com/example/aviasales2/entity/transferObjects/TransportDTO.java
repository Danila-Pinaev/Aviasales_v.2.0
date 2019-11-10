package com.example.aviasales2.entity.transferObjects;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
@Getter
@Setter
public class TransportDTO {
    public long id;
    String name;
    int baggage;
    int company;
    private Set<TripDTO> trips;

    public TransportDTO() {
    }
}