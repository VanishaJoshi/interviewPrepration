package org.example.inheritance;

// Define the superclass Animal
public class Animal {
    // Properties of the superclass
    private String name;
    private int age;

    // Constructor of the superclass
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Method to make a sound (can be overridden by subclasses)
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

