package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public void test() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(12);
        integers.add(21);
        integers.add(41);
        integers.add(15);
        integers.add(7);

       /* for(int i=0; i<integers.size(); i++){
            System.out.print(integers.get(i)+ " ");
        }*/


      /*  List<String> strings = new ArrayList<>();

        for(int i=0; i<integers.size(); i++) {
            strings.add("p-" + integers.get(i).toString());
        }

        for(int i=0; i<strings.size(); i++) {
            System.out.print(strings.get(i)+" ");
        }

        */ // ===>


        integers.stream().sorted().map(el -> "p-" + el.toString()).forEach(el -> System.out.print(el+" "));

    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}