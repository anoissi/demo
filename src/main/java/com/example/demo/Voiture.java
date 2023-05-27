package com.example.demo;

public class Voiture implements Comparable{
    String name;

    public Voiture(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return name.compareTo(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
