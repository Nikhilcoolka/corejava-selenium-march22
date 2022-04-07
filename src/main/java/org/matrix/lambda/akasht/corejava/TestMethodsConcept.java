package org.matrix.lambda.akasht.corejava;

public class TestMethodsConcept {

    //Method declaration
    public void m1() {
        System.out.println("I am in instance m1 methods"); //Method implementation
    }

    public static void m2() {
        System.out.println("I am in a static m2 method");
    }

    // Methods with parameter
    public void m3(int age) {
        System.out.println("My age is: +age");
    }

    public static void main(String[] args) {
        TestMethodsConcept obj = new TestMethodsConcept();
        obj.m1(); //Method calling by using ref variable
        Object TestMethodsConcept;
        m2(); //method calling by using class name
    }
}
