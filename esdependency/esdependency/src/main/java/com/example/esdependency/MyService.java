package com.example.esdependency;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private MyComponent component;
    final Logger logger = LoggerFactory.getLogger(MyService.class);

    public MyService(MyComponent component) {
        logger.debug("MyService constuctor");
        this.component = component;
    }

    public String getName(){
        return component.getmyComponentName();
    }
}
