package org.matrix.sigma.sunanda.ConceptsOfJava.MethodConcept;

public class MethodsWithoutParameters {
    public void m1(){
        System.out.println("I am in instance m1 method");
    }
    public static void m2() {
        System.out.println("I am in static m2 method");
    }

    public static void main(String[] args) {
        MethodsWithoutParameters obj = new MethodsWithoutParameters();
        obj.m1();
        MethodsWithoutParameters.m2();
    }
}

