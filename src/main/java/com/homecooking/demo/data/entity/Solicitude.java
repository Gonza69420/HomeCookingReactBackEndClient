package com.homecooking.demo.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Solicitude extends AbstractEntity {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    private String idclient;
    private String idchef;
    private String date;
    private String idmenuItems;
    private boolean status;

    public Solicitude(UUID id, String idclient, String idchef, String date, String idmenuItems, boolean status) {
        this.id = id;
        this.idclient = idclient;
        this.idchef = idchef;
        this.date = date;
        this.idmenuItems = idmenuItems;
        this.status = status;
    }

    public Solicitude() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getIdclient() {
        return idclient;
    }

    public void setIdclient(String idclient) {
        this.idclient = idclient;
    }

    public String getIdchef() {
        return idchef;
    }

    public void setIdchef(String idchef) {
        this.idchef = idchef;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIdmenuItems() {
        return idmenuItems;
    }

    public void setIdmenuItems(String idmenuItems) {
        this.idmenuItems = idmenuItems;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
