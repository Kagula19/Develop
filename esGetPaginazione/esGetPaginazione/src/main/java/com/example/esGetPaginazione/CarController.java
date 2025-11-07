package com.example.esGetPaginazione;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Pageable;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    CarRepository carRepository;

    @GetMapping("/all")
    public Iterable<CarEntity> getAllCars(){
        return carRepository.findAll();
    }

    @GetMapping("/getbycolor")
    public List<CarEntity> getCarColor(@RequestParam CarColor color){
        return carRepository.findByColor(color);
    }

    @GetMapping("/getpag")
    public List<CarEntity> getCarPag(@RequestParam String name, @RequestParam Integer page, @RequestParam Integer length ){
        return carRepository.findByNameContaining(name, PageRequest.of(page, length, Sort.by("name").descending()));

    }

}
