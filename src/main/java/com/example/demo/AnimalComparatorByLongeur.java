package com.example.demo;

import java.util.Comparator;

public class AnimalComparatorByLongeur implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getLongeur() - o2.getLongeur();
    }
}
