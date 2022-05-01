package org.matrix.lambda.nisha.constructors;

public class TestConstructor {

    int empId;
    String empName;

    public TestConstructor() {
        System.out.println("This is a no-args constructor");
    }

    public TestConstructor(int age, boolean a) {
        System.out.println("This is Parameterized Constructor");
        System.out.println("My age is " + age);
        System.out.println(a);
    }

    public static void main(String[] args) {
        TestConstructor obj1 = new TestConstructor(20, true);
        TestConstructor obj = new TestConstructor();

        /*
        TestConstructor - Class
        obj - Reference Variable
        = - Operator
        new - Object Keyword
        TestConstructor - Constructor
         */
    }
}


/*      ---Output----

This is Parameterized Constructor
My age is 20
true
This is a no-args constructor

 */

/*
                ----Constructor-----
Types of constructor:
1. Parameterised constructor
2. No-args constructor

Rules:
# Constructor name is same as class name
# Constructor does not have return type

Note:
Constructor can be public, private, protected, default

 */