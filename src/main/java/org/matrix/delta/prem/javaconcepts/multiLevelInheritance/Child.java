package org.matrix.delta.prem.javaconcepts.multiLevelInheritance;

public class Child extends Parent {
    int age = 26;

    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println("Child age is ="+obj.age);
        System.out.println("Parent age is ="+obj.age1);
        System.out.println("Grand father's age is ="+obj.age3);


    }
}
