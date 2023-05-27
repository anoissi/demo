package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@SpringBootApplication
public class DemoApplication {

    public void test() {
       Set<Student> students = new HashSet<>();

        students.add(new Student("Ali"));
        students.add(new Student("Sami"));
        students.add(new Student("Mariem") );
        students.add(new Student("Ali"));

        for (Student student : students) {
            System.out.print(student.name+" ");
        }
    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}
