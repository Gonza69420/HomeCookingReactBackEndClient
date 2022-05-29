package com.homecooking.demo.data.entity;

import org.hibernate.annotations.WhereJoinTable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "profiles")
public class Profile{
    //private Chef chef;
    @Id
    @Column(name = "user_id")
    private Long id;
    private String imageURL;
    @ManyToMany
    @JoinColumn(name = "restaurant_id")
    private List<Restaurant> restaurant;
    @OneToMany
    private List<Menu> menus;
    private String bio;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id" )
    @WhereJoinTable(clause = "role = 'ROLE_CHEF' ")
    private User chef;

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
        return (Chef) chef;
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
