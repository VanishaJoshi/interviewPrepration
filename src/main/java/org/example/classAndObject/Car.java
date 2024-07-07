package org.example.classAndObject;
// Class is template
// object is instance of closs which contain different value of state of class
public class Car {


    /// State
    private String color;
    private double price;
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
        this.brand = brand;
    }

    public static void main(String[] args) {
        Car maruti= new Car("maruti",100.0,"maruti");
        System.out.println( maruti.color);
        System.out.println( maruti.getColor());
    }


}


