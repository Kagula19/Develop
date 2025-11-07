package com.example.esdependency;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private MyService service;
    final Logger logger = LoggerFactory.getLogger(MyController.class);

    @Autowired
    MyService myService;

    public MyController(MyService service) {
        this.service = service;
        logger.debug("MyController constructor");
    }

    @GetMapping("/getName")
    public String getName(){
        logger.debug("MyService.getName()");
        return myService.getName();
    }

    @GetMapping("/")
    public String welcome(){
        logger.debug("MyService.welcome()");
        return "Welcome!";
    }

}
