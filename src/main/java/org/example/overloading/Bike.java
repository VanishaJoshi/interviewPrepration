package org.example.overloading;


// overloading is compile time polimorphism
public class Bike extends Vehicle {


    /*void run(){System.out.println("Vehicle is running");


    }
    void run(int x){System.out.println("Vehicle is running");}
    void run(String x){System.out.println("String Vehicle is running");}*/

   // void run(){System.out.println("Bike is running");}
    void run(Double d){System.out.println("Bike is running");}


}

 class Car extends Vehicle {

     void run() {
         System.out.println("Car is running");
     }

 }
