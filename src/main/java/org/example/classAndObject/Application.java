package org.example.classAndObject;

public class Application {

    public static void main(String[] args) {
        Car maruti= new Car("maruti",100.0,"maruti");
        // private state or method can't be accessed from other classes
       // System.out.println( maruti.color);
        System.out.println( maruti.getColor());
    }
}
