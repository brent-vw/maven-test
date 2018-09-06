package com.realdolmen.module.pets;

public class Cat implements Pet {
    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
