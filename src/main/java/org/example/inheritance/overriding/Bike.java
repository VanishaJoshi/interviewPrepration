package org.example.inheritance.overriding;


// Overriding is runtime polimorphism
public class Bike extends Vehicle{

    void run(){System.out.println("Bike is running");}


}

 class Car extends Vehicle {

     void run() {
         System.out.println("Car is running");
     }

 }
