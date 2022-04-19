package org.matrix.omega.jagannath.corejava.abstraction;

public abstract class TestClass extends TestAbstraction{
    TestClass(){
        System.out.println("I am in Testclass constructor");
    }
    public void saving(){
        System.out.println("Enter password for saving account");
    }
    public void withdrawal()
    {
        System.out.println("I am in cash withdrawal method");
    }



}
