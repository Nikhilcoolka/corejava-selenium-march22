package org.matrix.sigma.ashish.AbstractMethod;

public abstract class TestAbstractClass {

    public TestAbstractClass(){
        System.out.println("in Abstract class constructor");
    }

    public void m1(){
        System.out.println("I am in non abstract m1 method");
    }

    public abstract void m2();//abstract method
}
