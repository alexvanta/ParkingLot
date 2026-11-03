package com.parking.parkinglot.entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;

@Entity
@Table(name = "users")
public class User {
    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)


    @OneToMany(mappedBy = "owner", orphanRemoval = true)
    private Set<Car> cars = new LinkedHashSet<>();
    private Long id;

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    private String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}