package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    @FunctionalInterface
    interface Formule {
        Integer calculer(int a);

    }

    public void test() {


        Formule formule1 = a -> a + 1 ;

        System.out.println("méthode lamda1: "+ formule1.calculer(144));
        System.out.println("méthode lamda2: "+ ((Formule)((int a) -> a-154)).calculer(144).compareTo(2));
    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}