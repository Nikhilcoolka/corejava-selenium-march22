package org.matrix.delta.prem.javaconcepts.methods;

public class MethodsInJava {
    public void m1() {
        System.out.println(" i am in instance  m1 method"); // method implimentation
    }

    public static void m2() {
        System.out.println("i am in static m2 method");
    }

    public static void main(String[] args) {
        System.out.println("Test Method Concepts");
        MethodsInJava obj = new MethodsInJava();
        obj.m1(); // method calling using reference variable
        m2(); // static methods can be called directly within a same class or by using class
        // name

        System.out.println("this is methods without parameters");

    }
}


