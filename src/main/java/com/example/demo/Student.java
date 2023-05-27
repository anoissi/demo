package com.example.demo;

import java.util.Objects;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
        this.name = "Abdessattar";
    }

    @Override
    public String toString() {
        return name;
    }
}
