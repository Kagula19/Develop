package com.example.esapicustomqueries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class FlightController {
    @Autowired
    FlightRepository flightRepository;

    Random rand = new Random();

    @PostMapping("/flights")
    public List<FlightEntity> flights(){
        List<FlightEntity> allflights = IntStream.range(0, 50).mapToObj(i ->{

            FlightEntity fly = new FlightEntity();
            fly.setDescription(String.valueOf(rand.nextInt(51)));
            fly.setFromAirport(String.valueOf(rand.nextInt(51)));
            fly.setToAirport(String.valueOf(rand.nextInt(51)));
            fly.setType(FlightStatus.ONTIME);
            return fly;

        }).collect(Collectors.toList());
        flightRepository.saveAll(allflights);
        return flightRepository.findAll();
    }


}
