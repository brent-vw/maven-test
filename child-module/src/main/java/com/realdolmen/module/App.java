package com.realdolmen.module;

import com.realdolmen.module.family.Child;
import com.realdolmen.module.pets.Cat;
import com.realdolmen.module.pets.Dog;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        new Child(new Dog()).giveAttentionToPet();
        new Child(new Cat()).giveAttentionToPet();
    }
}
