package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {

    public void test() {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("el1", "value1");
        stringMap.put("el2", "value2");

        System.out.println(stringMap.entrySet());

        for(Map.Entry el : stringMap.entrySet()) {
            System.out.println(el.getValue());
        }

    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}
