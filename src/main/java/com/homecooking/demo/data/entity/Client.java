package com.homecooking.demo.data.entity;


import javax.persistence.*;
import java.util.*;

@Table(name = "client")
@Entity(name = "Client")
public class Client extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String mail;
    public String role = "ROLE_CLIENT";

    private String phoneNumber;
    private String dni;
    private boolean isActive;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(  name = "client_roles",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    private String password;


    public Client(String client_name, String client_last_name, String phone_number, String email, String client_dni, String password, boolean is_active) {
        this.firstName = client_name;
        this.lastName = client_last_name;
        this.phoneNumber = phone_number;
        this.mail = email;
        this.dni = client_dni;
        this.password = password;
        this.isActive = is_active;
    }

    public Client() {

    }


    @Override
    public String toString() {
        return String.format(
                "Customer[firstName='%s', lastName='%s' , mail='%s', phoneNumber='%s', dni='%s', isActive='%s', password='%s']",
                 firstName, lastName, mail, phoneNumber, dni, isActive, password);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ERole getRole() {return ERole.ROLE_CLIENT;}

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public Set<Role> getRoles() { return roles;}
    }

