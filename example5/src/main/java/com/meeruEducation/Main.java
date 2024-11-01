package com.meeruEducation;

import com.meeruEducation.bean.Vehicle;

import com.meeruEducation.config.ProjectConfiguration;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("Random number value is = " + randomNumber);

        if(randomNumber % 2 == 0) {
            context.registerBean("Volkswagen", Vehicle.class, volkswagenSupplier);
        }
        else {
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }

        Vehicle vWagen = null;
        Vehicle audi = null;

        try {
            vWagen = context.getBean("Volkswagen", Vehicle.class);
        }
        catch (NoSuchBeanDefinitionException e) {
            System.out.println("Error while getting Volkswagen bean");
        }

        try {
            audi = context.getBean("audi", Vehicle.class);
        }
        catch (NoSuchBeanDefinitionException e) {
            System.out.println("Error while getting Volkswagen bean");
        }

        if(audi != null) {
            System.out.println("Sprint context vehicle name is = " + audi.getName());
        }
        else {
            System.out.println("Sprint context vehicle name is = " + vWagen.getName());
        }
        context.close();
    }
}