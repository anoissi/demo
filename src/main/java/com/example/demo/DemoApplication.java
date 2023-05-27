package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Function;

@SpringBootApplication
public class DemoApplication {
    @FunctionalInterface
    interface Formule {
        Integer calculer(int a);

    }

    public void test() {

        Function<Integer, Integer> transFormIntgerTOs = n -> n*n;

        System.out.println(transFormIntgerTOs.apply(5));
    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}