package com.homecooking.demo.data.entity;

import javax.persistence.*;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;


@Entity
@Table(name = "admin")
public class Admin extends AbstractEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Role> roles;

    public Admin() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
        this.setRoles(Collections.singleton(Role.ROLE_ADMIN));
    }

    private void setRoles(Set<Role> singleton) {
        this.roles = singleton;
    }

    public String getUsername() {return username;}

    public String getPassword() {return password;}

}
