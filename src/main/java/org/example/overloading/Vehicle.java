package org.example.overloading;
// super class

// Note overloading exact same name , same return type but different number of paratmeter
// type of paratmener
class Vehicle{


    void run(){System.out.println("Vehicle is running");


    }
    void run(int x){System.out.println("Vehicle is running");}
    void run(String x){System.out.println("String Vehicle is running");}

    public static void main(String[] args) {
        Vehicle  vehicle = new Vehicle();
        vehicle.run(10);
        vehicle.run("xyz");
        vehicle.run();

    }
}
//Creating a child class

