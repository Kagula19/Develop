package com.example.es3controller;


import jakarta.persistence.*;

@Entity
@Table(name = "Ciao")
public class CiaoEntity {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    public long getId(){
        return id;
    }

}
