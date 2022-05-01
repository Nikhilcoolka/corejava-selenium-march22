package org.matrix.delta.prem.javaconcepts.methods;

public class MethodsWithParameters {

    public void m1(int age) {
        System.out.println("my age is =" + age);   //instance method example
    }

    public static void m2(String name, int age) {
        System.out.println("my name is " + name + " my age is = " + age); //Static method example
    }

    public static void m3(int a, int b) {
        int c = a * b;  //we can also use this in logical operations and function
        System.out.println("Static my age is =" + c);
    }

    public static void main(String[] args) {
        MethodsWithParameters obj = new MethodsWithParameters();
        obj.m1(26);
        m2("prem", 26);// this static method can be used n nuber of times so its very useful
        m2("rohan", 28);  //this is passing the values in methods
        m2("Shubham", 28);
        m3(13, 2);
    }
}
