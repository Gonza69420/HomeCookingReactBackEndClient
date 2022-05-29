package com.homecooking.demo.data.entity;


import org.hibernate.annotations.WhereJoinTable;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name= "restaurant")
public class Restaurant{
    @Id
    @Column(name = "user_id")
    @WhereJoinTable(clause = "ROLE = 'ROLE_CHEF' ")
    private Long id;
    private String name;
    private String address;
    private String city;
    @ManyToMany
    private List<Profile> profile;

    public Restaurant( String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public Restaurant() { //No args constructor for JPA

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
