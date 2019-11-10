package com.example.aviasales2.entity;


import com.example.aviasales2.entity.transferObjects.TransportDTO;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JsonBackReference(value = "cityRef1")
    @JoinColumn(name = "city_from")
    City cityFrom;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JsonBackReference(value = "cityRef2")
    @JoinColumn(name = "city_dest")
    City cityDest;

    BigDecimal price;
    int full_count_seats;
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "transport_id")
    Transport transport;

    Timestamp dateFrom;

    Timestamp dateDest;


    public Trip (){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public City getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(City cityFrom) {
        this.cityFrom = cityFrom;
    }

    public City getCityDest() {
        return cityDest;
    }

    public void setCityDest(City cityDest) {
        this.cityDest = cityDest;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public TransportDTO getTransport() {
        Mapper mapper = new DozerBeanMapper();
        TransportDTO transportDTO = mapper.map(transport, TransportDTO.class);
        return transportDTO;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Timestamp getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Timestamp dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Timestamp getDateDest() {
        return dateDest;
    }

    public void setDateDest(Timestamp dateDest) {
        this.dateDest = dateDest;
    }

    public void setFullCountSeats(int full_count_seats) {
        this.full_count_seats = full_count_seats;
    }

    public int getFullCountSeats() {
        return full_count_seats;
    }
}
