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

//    @Override
//    public boolean equals(Object obj) {
//        // Object obj= cow1;
//      /*  Animal animal= new Dog("x",4,"xf");
//        //  Animal cow1= new Animal("cow",7);
//         Object x=  new Animal("cow",7);
//        Object x1   = new Dog("x",4,"xf");*/
//       // obj= new Integer("1");
//        Animal animal= (Animal) obj;
//        return this.age==animal.age && this.name.equals(animal.name);
//    }
}

