package org.example.animal;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@ToString
@Component
@Scope("prototype")
public class Cat implements Animal {

    @Value("${cat.name}")
    private String name;
    @Value("${cat.age}")
    private int age;
    @Value("${cat.breed}")
    private String breed;
    @Value("${cat.color}")
    private String color;

    @Override
    public void animalPlus() {
        System.out.println("cats are cute and soft");
    }

    @Override
    public void animalMinus() {
        System.out.println("cats don't have minus");
    }

    @PostConstruct
    public void init() {
        System.out.println("cat init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("cat destroy");
    }
}
