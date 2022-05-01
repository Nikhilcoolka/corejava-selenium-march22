package org.matrix.lambda.nisha.constructors;

public class TestChild extends TestParent {

    TestChild() {
        super();             //when a child class extends and in parent class constructor is
        // created then compiler will automatically add super() as its first statement in constructor
        // it will execute the parent class constructor first and child.

        System.out.println("TestChild :: Constructor");
    }

    public void data() {
        System.out.println("This is a method");
    }

    public static void main(String[] args) {
        TestChild obj = new TestChild();
        obj.data();

        TestParent get = new TestParent();
        obj.data();


        //new TestChild();
        //new TestChild().data();         // without using Reference Variable
        //obj.data();                   // By using Reference Variable i.e
    }
}
