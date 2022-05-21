package com.homecooking.demo.data.entity;


import javax.persistence.*;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name= "Restaurant")
public class Restaurant extends AbstractEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
