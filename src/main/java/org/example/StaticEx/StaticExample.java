package org.example.StaticEx;

public class StaticExample {

    /// Static - variable ,method, class

    StaticExample(){
        System.out.println("constructor");
    }
    static {
        System.out.println("block");
    }

    public static void main(String[] args) {
        StaticExample example= new StaticExample();
    }

}
