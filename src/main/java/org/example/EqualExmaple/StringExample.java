package org.example.EqualExmaple;

import org.example.inheritance.Animal;

public class StringExample {
/// NOTES: OBJECT class is parent of all the objects/class
    // toString,equals,hascode,clone--> these methods get inherited to all the classes/object
    public static void main(String[] args) {

        Animal cow= new Animal("cow",7);
        Animal cow1= new Animal("cow",7);
        //String, Wrapper(Integer,Long,Double) Class, ==> they overriden equals method which check if content are equals or not if it is
        // equal then it will return true else false.

        // for primtive type byte,long,int,double,float,short - == =>this will check content
        int a=2;
        int b=2;
        System.out.println(a==b);
        /// == always check if the two objects are pointing to same memory location
        System.out.println(cow==cow1);
        System.out.println(cow.equals(cow1));


        ///
        Integer i=1;
        Integer i1=1;
        System.out.println(i==i1);

        String s1= new String("cow");
        String s2= new String("cow");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        // String pool
        // its area in heap; [       [Stringpool]                ]
       // String pool = cow , abc(x01) ,1


        String s3= "abc";
        String s4="abc";
       // s3=s4;

        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));


    }
}


// Equals and ==
