package org.matrix.omega.corejava.methods;

public class TestMethodsConcept {

    // Method declaration
    public void m1() {
        System.out.println("I am in instance m1 method"); // Method implementation
    }


    // Static method
    public static void m2() {
        System.out.println("I am in static m2 method");
    }

    // Method with parameter
    public void m3(int age) {
        System.out.println("My age is: " + age);
    }

    public static void m4(int age) {
        System.out.println("Static method..My age is :" + age);
    }

    public static void m5(int a, int b) {
        int c = a * b;
        System.out.println("Static method..Multiplication is :" + c);
    }

    public static void main(String[] args) {
        TestMethodsConcept obj = new TestMethodsConcept();
        obj.m1(); // Method calling by using ref variable
        TestMethodsConcept.m2(); // Method calling by using class name

        obj.m3(20); // Passing the value to the method
        obj.m3(30);
        obj.m3(100);

        m4(30);
        TestMethodsConcept.m4(25);
        TestMethodsConcept.m5(10, 20);

    }
}
