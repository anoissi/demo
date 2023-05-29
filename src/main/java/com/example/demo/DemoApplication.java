package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public void test() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.increment();
        student2.increment();
        student3.increment();
        student1.increment();

        int i1 = student1.instanceField;
        int s1 = Student.staticField;

        int i2 = student2.instanceField;
        int s2 = Student.staticField;

        int i3 = student3.instanceField;
        int s3 = Student.staticField;

        System.out.println("student1 => instance : " + i1 + " static: " + s1); // => 3 7
        System.out.println("student2 => instance : " + i2 + " static: " + s2); // => 2 7
        System.out.println("student3 => instance : " + i3 + " static: " + s3); // => 2 7
    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}