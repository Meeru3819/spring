package com.meeruEducation;

import com.meeruEducation.bean.Vehicle;

import com.meeruEducation.config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Before context called");
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        System.out.println("After context called");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Sprint context vehicle name is = " + vehicle.getName());
        System.out.println("Sprint context vehicle method value = " + vehicle.getHello());
        context.close();
    }
}