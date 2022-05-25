package com.homecooking.demo.data.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "profileschef")
public class Profile{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    private Chef chef;
    private String imageURL;
    @ManyToMany
    @JoinColumn(name = "restaurant_id")
    private List<Restaurant> restaurant;
    @OneToMany
    private List<Menu> menus;
    private String bio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Profile(Chef chef, List<Restaurant> restaurant, List<Menu> menus, String bio) {
        this.chef = chef;
        this.restaurant = restaurant;
        this.menus = menus;
        this.bio = bio;
        imageURL = null;
    }


    public Profile() {

    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public List<Restaurant> getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(List<Restaurant> restaurant) {
        this.restaurant = restaurant;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
