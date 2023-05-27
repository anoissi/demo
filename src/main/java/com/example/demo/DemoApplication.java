package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@SpringBootApplication
public class DemoApplication {

    public void test() {
       Set<Animal> animals = new TreeSet<>();

       animals.add(new Animal(5, 36));
       animals.add(new Animal(6, 12));
       animals.add(new Animal(2, 7));

        for (Animal animal : animals) {
            System.out.print(animal+" ");
        }
    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}
