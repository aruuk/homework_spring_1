package org.example.person;

import lombok.*;
import org.example.animal.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Component("hmm")
public class Person {

    @Value("${hmm.name}")
    private String name;
    @Value("${hmm.age}")
    private int age;
    Animal animal;

    @Autowired
    public Person(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }

    public void whichAnimal() {
        System.out.println(name);
        this.animal.animalMinus();
        this.animal.animalPlus();
    }
}
