package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {

    interface Formule {
        double calculer(int a);

        double multipluer(int a, int b);

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

            @Override
            public double multipluer(int a, int b) {
                return 0;
            }
        };
        System.out.println(formule.calculer(144));
    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}
