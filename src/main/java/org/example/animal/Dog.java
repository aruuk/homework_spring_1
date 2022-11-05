package org.example.animal;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@ToString
@Component
public class Dog implements Animal {

    @Value("${dog.name}")
    private String name;
    @Value("${dog.age}")
    private int age;
    @Value("${dog.breed}")
    private String breed;
    @Value("${dog.color}")
    private String color;

    @Override
    public void animalPlus() {
        System.out.println("dogs are smart and faithful");
    }

    @Override
    public void animalMinus() {
        System.out.println("dog don't have minus");
    }

    @PostConstruct
    public void init() {
        System.out.println("dog init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("dog destroy");
    }
}
