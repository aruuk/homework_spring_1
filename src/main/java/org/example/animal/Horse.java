package org.example.animal;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Component
public class Horse implements Animal {

    @Value("${horse.name}")
    private String name;
    @Value("${horse.age}")
    private int age;
    @Value("${horse.breed}")
    private String breed;
    @Value("${horse.color}")
    private String color;

    @Override
    public void animalPlus() {
        System.out.println("horses are smart and kind");
    }

    @Override
    public void animalMinus() {
        System.out.println("horses don't have minus");
    }
}
