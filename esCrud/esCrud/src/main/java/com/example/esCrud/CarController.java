package com.example.esCrud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cars")

public class CarController {
    @Autowired
    CarRepository carRepository;

    @GetMapping("/all")
    public Iterable<CarEntity> getAllCars(){
        return carRepository.findAll();
    }

    @PostMapping("/newCar1")
    public CarEntity getNewCar1(){
        CarEntity newCar1 = new CarEntity(1L,"PrimaAuto",CarType.NUOVO,CarColor.BIANCO,"la prima auto");
        carRepository.save(newCar1);
        return newCar1;
    }
    @PostMapping("/newCar2")
    public CarEntity getNewCar2(){
        CarEntity newCar2 = new CarEntity(2L,"PrimaAuto",CarType.USATO,CarColor.ROSA,"la seconda auto");
        carRepository.save(newCar2);
        return newCar2;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<CarEntity> getCar(@PathVariable Long id){
        Optional<CarEntity> car = carRepository.findById(id);
        if (car.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(car.get());
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<CarEntity> updateType(@PathVariable Long id, @RequestParam CarType newtype) {
        if (!carRepository.existsById(id)) {
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        CarEntity car = carRepository.findById(id).get();
        car.setType(newtype);
        return ResponseEntity.ok(carRepository.save(car));
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<Void> deleteCar(@PathVariable Long id) {
        if (!carRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        carRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/deleteall")
    public ResponseEntity<CarEntity> deleteAllCars(){
        carRepository.deleteAll();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
