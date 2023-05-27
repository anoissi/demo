package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    @FunctionalInterface
    interface Formule {
        double calculer(int a);

        default double sqrt(int a) {
            return Math.sqrt(a);
        }
    }

    public void test() {
        Formule formule = new Formule() {
            @Override
            public double calculer(int a) {
                return sqrt(a);
            }
        };

        // ==>


        Formule formule1 = (int a) -> formule.sqrt(a);

        System.out.println(formule1.calculer(144));
    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}