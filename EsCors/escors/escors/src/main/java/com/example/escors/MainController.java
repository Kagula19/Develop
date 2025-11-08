package com.example.escors;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MainController {

    @GetMapping("/custom")
    public String customEndpoint() {
        return "Benvenuto! Al mio programma.";
    }


}
