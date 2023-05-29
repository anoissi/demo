package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public void test() {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        // System.out.println("Static Field: "+ Student.getStaticField());

        int v1 = student1.instanceField;
        int v2 = student1.staticField;

        int v11 = Student.instanceField; /// erreur
        int v22 = Student.staticField;



        System.out.println("instance : "+ v1+ " static: "+  v2+" static: ");
    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}