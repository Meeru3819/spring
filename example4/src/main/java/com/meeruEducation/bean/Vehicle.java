package com.meeruEducation.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHello() {
        return "Hello";
    }

    @PostConstruct
    public void initialized() {
        System.out.println("Initialized Vehicle");
        this.setName("Harrier");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("Destroyed Vehicle");
    }



}
