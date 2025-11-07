package com.example.esapicustomqueries;


import jakarta.persistence.*;

@Entity
@Table(name = "Flight")
public class FlightEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "description")
    private String description;

    @Column(name = "fromAirport")
    private String fromAirport;

    @Column(name = "toAirport")
    private String toAirport;

    @Column(name = "FlightStatus ")
    @Enumerated(EnumType.STRING)
    private FlightStatus type ;

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public FlightStatus getType() {
        return type;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public void setType(FlightStatus type) {
        this.type = type;
    }

    public FlightEntity() {}

    public FlightEntity(long id, String description, String fromAirport, String toAirport, FlightStatus type) {
        this.id = id;
        this.description = description;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.type = type;
    }
}
