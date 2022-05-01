package org.matrix.lambda.amruta.constructor;

public class TestConstructor2 {
    int age;

    public TestConstructor2(){ // no args constructor
        age=30;
        System.out.println("The Age:"+age);
    }

    public static void main(String[] args) {
        TestConstructor2 obj=new TestConstructor2();

    }
}
