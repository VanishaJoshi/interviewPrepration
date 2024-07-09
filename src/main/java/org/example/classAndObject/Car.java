package org.example.classAndObject;
// Class is template
// object is instance of closs which contain different value of state of class
public class Car {
// Encapsulation :  state and behavior together in one class with restric access (private,
    //public ,protected,deault)

    /// State - this is not local variable
    // instance variable
    /// Reference/Object Data Types -store in heap
    private String color;
    // primitive - store in stack
    private double price;
    /// Wrapper classes
    // All primitive type have corresponding wrapper class.
    private Double year;
    private String brand;




   // constructor
    public Car(String color, double price, String brand) {
        this.color = color;
        this.price = price;
        this.brand = brand;
    }
    // Behavior - Method
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        // local variable and scope with in the method
        int a= 2;
        this.brand = brand;
    }

    public static void main(String[] args) {
        Car maruti= new Car("maruti",100.0,"maruti");
        System.out.println( maruti.color);
        System.out.println( maruti.getColor());
    }


}


