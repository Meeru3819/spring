package com.meeruEducation;

import com.meeruEducation.bean.Vehicle;

import com.meeruEducation.config.ProjectConfiguration;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean("tata", Vehicle.class);
        System.out.println("Sprint context vehicle name is = " + vehicle.getName());
        context.close();
    }
}