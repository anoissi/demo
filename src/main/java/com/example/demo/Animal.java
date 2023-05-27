package com.example.demo;

class Animal implements Comparable<Animal> {
    public static  int counter = 0;
    private String name;
    private int age;
    private int longeur;

    public Animal(int age, int longeur, String name) {
        this.name = name;
        this.age = age;
        this.counter++;
    }


    @Override
    public String toString() {
        return "(name: " + name + " age: " + age + " longeur: " + longeur + ")";
    }

    @Override
    public int compareTo(Animal o) {
        return o.age-this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }
}