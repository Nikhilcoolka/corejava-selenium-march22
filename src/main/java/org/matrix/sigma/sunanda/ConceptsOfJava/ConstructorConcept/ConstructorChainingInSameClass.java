package org.matrix.sigma.sunanda.ConceptsOfJava.ConstructorConcept;

public class ConstructorChainingInSameClass {
    public ConstructorChainingInSameClass(){
        this (10,"Sunanda");
        System.out.println("This is a No-args constructor");
    }
    public ConstructorChainingInSameClass(int age) {
        System.out.println("My age is: " + age);
    }
    public ConstructorChainingInSameClass(int age, String name) {
        this(100);
        System.out.println("I am in 2 param constr");
    }
    public static void main(String[] args) {
        ConstructorChainingInSameClass obj = new ConstructorChainingInSameClass();
    }
}
