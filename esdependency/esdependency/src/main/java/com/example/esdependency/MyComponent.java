package com.example.esdependency;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public String myComponentName;
    final Logger logger = LoggerFactory.getLogger(MyComponent.class);

    public MyComponent() {
        logger.debug("MyComponent constuctor");
        this.myComponentName = "dario";
    }

    public String getmyComponentName(){
        logger.debug("MyComponent.getMyComponentName()");
        return myComponentName;
    }
}
