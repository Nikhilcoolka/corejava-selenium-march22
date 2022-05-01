package org.matrix.sigma.pankaj.Method;

public class TestMethodConcept1 {
    //this is method signature or method declaration and inside parameter also came under signature
    public void p1() {
        System.out.println("hello i am pankaj i am in instance method p1"); // method implementation
    }

    // static method
    public static void p2() {
        System.out.println("hello i am pankaj i am in static method p2");
    }

    //method with parameter
    public void p3(int age) {
        System.out.println("my age is: " +age);

    }

    //static method
    public static void p4(int age) {
        System.out.println("my age is:" +age);
    }

    public static void main(String[] args) {
        TestMethodConcept1 obj = new TestMethodConcept1();
        obj.p1();  // method calling by using reference variable
        TestMethodConcept1.p2(); // method calling by using class name

        obj.p3(28);
        obj.p3(56); // passing the value to the method
        obj.p3(76);

        p4(28);
        TestMethodConcept1.p4(29);

    }
}
