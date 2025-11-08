package com.example.esdeploy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BasicController {

    Random random = new Random();
    @GetMapping
    public int Somma(){
        int n1 = random.nextInt();
        int n2 = random.nextInt();
        int somma = n1 + n2;
        return somma;
    }


}
