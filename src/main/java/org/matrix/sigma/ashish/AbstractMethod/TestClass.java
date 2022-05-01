package org.matrix.sigma.ashish.AbstractMethod;

public class TestClass extends TestAbstractClass {

    public TestClass(){
        System.out.println("I am in TestClass Constructor");
    }
    public void m2(){
        System.out.println("I am in Implemented Abstract method");
    }

    public static void main(String[] args) {
        TestClass obj=new TestClass();
        obj.m2();
        obj.m1();

    }
}
