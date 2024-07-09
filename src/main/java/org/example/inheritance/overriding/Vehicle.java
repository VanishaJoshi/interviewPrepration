package org.example.inheritance.overriding;
// super class

// Note :for override inherited method should have same siganture (return type , name , parameter)
class Vehicle{
    void run(){System.out.println("Vehicle is running");
    }

    public static void main(String args[]){

        Vehicle vehicle= new Vehicle();
        vehicle.run();

        vehicle= new Car();
        vehicle.run();

        vehicle = new Bike();
        vehicle.run();
    }
}
//Creating a child class

