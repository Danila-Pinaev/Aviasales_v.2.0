package com.example.aviasales2.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;



@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "tour")
@NoArgsConstructor
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;
    private int price;
    Timestamp date;

    private int duration;
    private String city_destination;
    private short rating;


    @ManyToMany
    @JoinTable (name="history",
            joinColumns=@JoinColumn (name="tour_id"),
            inverseJoinColumns=@JoinColumn(name="user_id"))
    private List<User> users;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "tour_id")
    private Hotel hotel;


    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference(value = "cityRef3")
    private City cityId;

    @OneToMany(mappedBy = "tour", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference(value = "tourcomm")
    List<Comments> comments;

    enum status{
        ONLINE,
        OFFLINE
    }

    @JsonIgnore
    public List<User> getUsers() {
        return users;
    }

    public Tour(City cityId) {
        this.cityId = cityId;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }
}