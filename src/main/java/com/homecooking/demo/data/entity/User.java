package com.homecooking.demo.data.entity;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.persistence.*;
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String email;

    private String password;

    private ERole role;

    @OneToMany(mappedBy = "chefs", orphanRemoval = true)
    private List<Menu> menus = new ArrayList<>();

    /*@OneToOne(orphanRemoval = true)
    @JoinColumn(name = "profile_id")
    private Profile profile;*/

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Profile profile;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(ERole role) {this.role = role;}

    public ERole getRole() {return role;}

    public String getMail() {return email;}

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new Role(getRole().name()));
    }
}