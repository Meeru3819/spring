package com.meeruEducation;

import com.meeruEducation.bean.Vehicle;

import com.meeruEducation.config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.setName("XUV700");
        System.out.println("Sprint context vehicle name is = " + vehicle.getName());
        System.out.println("Sprint context vehicle method value = " + vehicle.getHello());

    }
}