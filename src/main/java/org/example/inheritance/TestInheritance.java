package org.example.inheritance;

// Main class to test inheritance
public class TestInheritance {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");

        // Access properties and methods inherited from the Animal class
        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());

        // Access property specific to the Dog class
        System.out.println("Breed: " + myDog.getBreed());

        // Call the overridden method
        myDog.makeSound();

        // Call the method specific to the Dog class
        myDog.fetch();

        Animal animal = new Animal("Buddy", 3 );
        animal.getAge();
        animal.getName();
        //not accessible as it child behavior or state parent cann't access
       // animal.getBreed();
    }
}

