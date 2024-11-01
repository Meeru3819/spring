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
        System.out.println("Sprint context vehicle name is = " + vehicle.getName());

        Vehicle audiVehicle = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Sprint context vehicle name is = " + audiVehicle.getName());

        Vehicle ferrariVehicle = context.getBean("ferrariVehicle", Vehicle.class);
        System.out.println("Sprint context vehicle name is = " + ferrariVehicle.getName());

        Vehicle bmwVehicle = context.getBean("bmwVehicle", Vehicle.class);
        System.out.println("Sprint context vehicle name is = " + bmwVehicle.getName());

    }
}