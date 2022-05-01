package org.matrix.sigma.pankaj.corejava.oopsconcept.polymorphism.overriding;

public class Child extends Parent{
    public String m1(){
        System.out.println("in child m1 method");
        return "pankaj";

    }

    public static void main(String[] args) {
      Parent p = new Child();
      p.m1();
    }
}
