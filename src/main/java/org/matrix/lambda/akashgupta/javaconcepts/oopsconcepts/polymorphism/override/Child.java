package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.polymorphism.override;

public class Child extends Parent {

    public String m1() {    //different data type must have IS-A relation.(child-->parent)
        System.out.println("Example of overriding methods with different return type");
        return null;
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.m1();

    }
}
