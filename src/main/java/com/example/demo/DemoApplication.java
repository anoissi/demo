package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {

    public void test() {
       Set<Student> abdo = new TreeSet<>((Comparator) new StudentComparator());

        abdo.add(new Student("Ali"));
        abdo.add(new Student("Sami"));
        abdo.add(new Student("Mariem") );
        abdo.add(new Student("Ali"));

        /*for (Student student : students) {
            System.out.print(student.name+" ");
        }*/

        Iterator<Student> studentIterator = abdo.iterator();

        while (studentIterator.hasNext()) {
            System.out.print(studentIterator.next().name + " ");
        }


    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}
