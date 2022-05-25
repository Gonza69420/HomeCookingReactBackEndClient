package com.homecooking.demo.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Menu{ //Food Menu items

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String description;
    private int price;
    private String category;
    @ManyToOne
    private Profile profile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Menu(String name, String description, int price,String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;

    }

    public Menu() {

    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public int getPrice() {return price;}

    public void setPrice(int price) {this.price = price;}

    public String getCategory() {return category;}

    public void setCategory(String category) {this.category = category;}

}
