package org.example.inheritance;

// Define the subclass Dog that inherits from Animal
public class Dog extends Animal {
    // Additional property for the subclass
    private String breed;

    // Constructor of the subclass
    public Dog(String name, int age, String breed) {
        // Call the constructor of the superclass
        super(name, age);
        this.breed = breed;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }

    // Additional method specific to the Dog class
    public void fetch() {
        System.out.println("The dog is fetching the ball");
    }
}
