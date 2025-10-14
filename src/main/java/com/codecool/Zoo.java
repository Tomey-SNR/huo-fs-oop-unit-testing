package com.codecool;

import com.codecool.animal.*;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Lion("Leo", 5, 90));
        animals.add(new Parrot("Polly", 2, 60));
        animals.add(new Lion("Zelda", 7, 10));

        System.out.println("Welcome to the Zoo! It's morning feeding time...");

        for (Animal animal : animals) {
            System.out.print(animal.getName() + " ");
            animal.makeSound();

        }

        System.out.println("\nFeeding time is over.");
    }
}
