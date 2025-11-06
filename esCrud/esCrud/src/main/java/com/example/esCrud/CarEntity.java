package com.example.esCrud;

import jakarta.persistence.*;
@Entity

@Table(name = "Car")
public class CarEntity {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "modelName" , nullable = false)
    private String modelName;

    @Column(name = "type " , nullable = false)
    @Enumerated(EnumType.STRING)
    private CarType type ;

    @Column(name = "color " , nullable = false)
    @Enumerated(EnumType.STRING)
    private CarColor color  ;

    @Column(name = "description " , nullable = true)
    private String description;


    public long getId(){
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public CarType getType() {
        return type;
    }

    public CarColor getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private CarEntity() {}

    public CarEntity(long id, String modelName, CarType type, CarColor color, String description) {
        this.id = id;
        this.modelName = modelName;
        this.type = type;
        this.color = color;
        this.description = description;
    }

}
