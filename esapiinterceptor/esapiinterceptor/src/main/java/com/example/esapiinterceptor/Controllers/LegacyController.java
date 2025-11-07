package com.example.esapiinterceptor.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class LegacyController {

    @GetMapping("/legacy")
    public String getOldString(){
        return "This is just old code";
    }


}
