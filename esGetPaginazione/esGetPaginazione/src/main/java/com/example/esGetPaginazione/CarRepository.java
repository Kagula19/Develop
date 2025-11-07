package com.example.esGetPaginazione;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<CarEntity, Long> {

    @Query(value = "select * from Car c where c.color = ?1", nativeQuery = true)
    List<CarEntity>findByColor(CarColor color);


    List<CarEntity>findByNameContaining(String name, Pageable pageable);
}
