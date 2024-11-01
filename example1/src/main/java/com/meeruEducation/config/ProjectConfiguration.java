package com.meeruEducation.config;

import com.meeruEducation.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    @Bean
    Vehicle vehicle() {
        Vehicle veh = new Vehicle();
        veh.setName("Harrier");
        return veh;
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer value() {
        return 10;
    }
}
