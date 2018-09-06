package com.realdolmen.module.family;

import com.realdolmen.module.pets.Pet;

public class Child {
    private final Pet pet;

    public Child(Pet pet) {
        this.pet = pet;
    }

    public void giveAttentionToPet() {
        pet.makeNoise();
    }
}
