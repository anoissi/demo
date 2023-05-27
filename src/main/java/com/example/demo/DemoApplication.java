package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@SpringBootApplication
public class DemoApplication {

    public void test() {
        Set<Integer> s = new HashSet<>();

        s.add(5);
        s.add(-1);
        s.add(3);
        s.add(3);
        s.add(3);
        s.add(3);
        s.add(13);
        s.add(33);
        s.add(3);
        s.add(3);
        s.add(31);
        s.add(32);
        s.add(3);
        s.add(3);
        s.add(3);
        s.add(13);
        s.add(3);
        s.add(35);
        s.add(3);
        s.add(83);
        s.add(3);

        // ------- ------ -----

        Set<Integer> s1 = new TreeSet<>();

        s.add(5);
        s.add(-1);
        s.add(3);
        s.add(3);
        s.add(3);
        s.add(3);
        s.add(13);
        s.add(33);
        s.add(3);
        s.add(3);
        s.add(31);
        s.add(32);
        s.add(3);
        s.add(3);
        s.add(3);
        s.add(13);
        s.add(3);
        s.add(35);
        s.add(3);
        s.add(83);
        s.add(3);

        for (Integer el : s) {
            System.out.println(el);
        }
        System.out.println("//////////////////////////////////////");
        for (Integer el : s1) {
            System.out.println(el);
        }
    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}
