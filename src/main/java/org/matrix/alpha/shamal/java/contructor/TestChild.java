package org.matrix.alpha.shamal.java.contructor;

public class TestChild extends TestParent{

    TestChild(){
        super(); // Compiler will add super() as a first statement in constructor
        System.out.println("This is the Child :: constructor ");
    }

    TestChild(int age){
        System.out.println("This is the parametrised constructor");
    }

    public int TestChild(int age){
        return 0;  // this is the normal method
    }

    public static void main(String[] args) {
        TestChild obj = new TestChild();

        obj.TestChild(12); // Calling by reference variable

        new TestChild().TestChild(20); // calling without ref object

        TestParent obj1 = new TestParent();

    }
}
