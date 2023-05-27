package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public void test() {
        List<Animal> l = new ArrayList<>();
        l.add(new Animal(6, 5));
        l.add(new Animal(5, 6));

        Collections.sort(l, new AnimalComparatorByLongeur());

        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}
