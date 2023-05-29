package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public void test() {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Abdessattar";
        student2.name = "Imen";

        System.out.println(student1.name); // ==> Imen
        System.out.println(student2.name); // ==> Imen
    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}