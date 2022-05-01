package org.matrix.delta.prem.javaconcepts.overriding;

public class OverridingParent {      //using same method but we want to change logic
                                    // different logic in parent class & we are using different logic in child class
    public void m1(){
        System.out.println("i m in Parent m1 method");
    }

    public void m1(int a){
        System.out.println("i m in Parent m1 int method");
    }
}
