package com.example.demo;

import java.util.Objects;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
