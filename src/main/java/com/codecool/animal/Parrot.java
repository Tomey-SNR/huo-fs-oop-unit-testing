package com.codecool.animal;

public class Parrot extends Animal {

    public Parrot(String name, int age, int health) {
        super(name, age, health);
    }

    @Override
    public void makeSound() {
        System.out.println("squawks: Squawk! Pieces of eight!");
    }
}
