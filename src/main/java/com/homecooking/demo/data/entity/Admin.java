package com.homecooking.demo.data.entity;

import javax.persistence.*;
import java.util.Collections;
import java.util.Set;


@Entity
@Table(name = "admin")
public class Admin extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<ERole> roles;

    public Admin() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
        roles.add(ERole.ROLE_ADMIN);
    }


    public String getUsername() {return username;}

    public String getPassword() {return password;}

}
