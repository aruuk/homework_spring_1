package org.example;

import org.example.person.Person;
import org.example.person.Person2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("hmm", Person.class);
        person.whichAnimal();

        Person2 person2 = context.getBean("person2", Person2.class);
        person2.whichAnimal();

        context.close();
    }
}
