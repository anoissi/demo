package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {

    public void test() {

        Animal a1 = new Animal(2, 1, "Cheval");
        Animal a2 = new Animal(1, 1, "Chien");
        Animal a3 = new Animal(1, 1, "Chat");

        System.out.println(a1);
        System.out.println(" Nombre d'objet = "+Animal.counter);

    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}
