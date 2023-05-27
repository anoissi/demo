package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {

    public void test() {
        Map<Student, Voiture> studentVoitureMap = new TreeMap<>(new StudentComparator());

        Student student1 = new Student("Ali");
        Student student2 = new Student("Badr");

        Voiture voiture1 = new Voiture("BM");
        Voiture voiture2 = new Voiture("Nissan");

        studentVoitureMap.put(student1, voiture1);
        studentVoitureMap.put(student2, voiture2);


        System.out.println(studentVoitureMap);


    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}
