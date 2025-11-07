package com.example.esGetPaginazione;

import jakarta.persistence.*;

@Entity

@Table(name = "Car")
public class CarEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name" , nullable = false)
    private String name;

    @Column(name = "color" , nullable = false)
    @Enumerated(EnumType.STRING)
    private CarColor color  ;


    public String getName() {
        return name;
    }

    public CarColor getColor() {
        return color;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    private CarEntity() {}

    public CarEntity( String name, CarColor color) {
        this.name = name;
        this.color = color;
    }
}
