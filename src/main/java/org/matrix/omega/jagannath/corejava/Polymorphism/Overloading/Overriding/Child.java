package org.matrix.omega.jagannath.corejava.Polymorphism.Overloading.Overriding;

public class Child  extends Parent{
    public String m1()
    {
        System.out.println("I am in Child m1 method");
        return "zz";
    }

    public static void main(String[] args) {
        Parent p=new Child();
        p.m1();

    }
}
