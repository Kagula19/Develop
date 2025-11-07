package com.example.esapiinterceptor.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class BasicController {

    @GetMapping("/time")
    public String getDate(){
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter dataformatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataString = data.format(dataformatter);
        return  dataString;
    }


}
