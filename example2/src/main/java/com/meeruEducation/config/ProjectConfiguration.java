package com.meeruEducation.config;

import com.meeruEducation.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfiguration {

    @Bean(name = "audiVehicle")
    Vehicle vehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Bean(name = "ferrariVehicle")
    Vehicle vehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Ferrari");
        return vehicle;
    }

    @Primary
    @Bean(name = "bmwVehicle")
    Vehicle vehicle3() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");
        return vehicle;
    }
}
