package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {

    class DemoUtil<T> {
        public T concat (T obj1, T obj2) {
            if(obj1 instanceof  String && obj2 instanceof String){
                String objString1 = (String) obj1;
                String objString2 = (String) obj2;
                String result = objString1.concat(objString2);
                // System.out.println(result);
                return (T)result;
            }

            if(obj1 instanceof  Student && obj2 instanceof Student){
                String objString1 = ((Student) obj1).name;
                String objString2 = ((Student) obj2).name;

                Student student = new Student(objString1+ " " + objString2);
                // System.out.println(student);
                return (T)student;
            }
            return null;
        }
    }

    public void test() {
        DemoUtil<Integer> demoUtil = new DemoUtil<>();
        System.out.println(demoUtil.concat(Integer.valueOf(1), Integer.valueOf(2)));
    }

    public static void main(String[] args) {
        DemoApplication hello = new DemoApplication();
        hello.test();
    }

}
