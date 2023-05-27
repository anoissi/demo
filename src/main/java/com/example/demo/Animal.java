package com.example.demo;

class Animal implements Comparable<Animal>{
    int age;
    int longeur;

    public Animal(int age, int longeur) {
        this.age = age;
        this.longeur = longeur;
    }




    @Override
    public String toString() {
        return "(age: " + age + " longeur: " + longeur + ")";
    }

    @Override
    public int compareTo(Animal o) {
        return o.age-this.age;
    }
}