package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {

    public void test() {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("el1", "value1");
        stringMap.put("el2", "value2");
        stringMap.put(null, "value2");

        System.out.println(stringMap.get("el1"));
        System.out.println(stringMap.isEmpty());
        System.out.println(stringMap.keySet());
        System.out.println(stringMap.values());
        System.out.println(stringMap.remove("el1"));
        System.out.println(stringMap);

    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}
