package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.polymorphism.overload;

public class OverloadingAmbiguity {
    public void add(int a, float b) {
        System.out.println(a + b);
    }

    public void add(float a, int b) {
        System.out.println(a + b);
    }

    public void add(long a, int b) {
        System.out.println(a + b);
    }

    public void add(char a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, char b) {
        System.out.println(a + b);     //internal promotion
    }


    public static void main(String[] args) {
        OverloadingAmbiguity obj = new OverloadingAmbiguity();
        // obj.add(10,10);          //::overloading Ambiguity
        //obj.add(10.0,10);        //:: overloading Ambiguity
        obj.add('a', 10);       // matching method so there is no Ambiguity
        //obj.add(10,97);       //:: overloading Ambiguity due to internal promotion
    }
}
