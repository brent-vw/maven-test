package com.realdolmen.module.pets;

public class Dog implements Pet {
    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }
}
