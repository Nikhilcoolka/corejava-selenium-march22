package org.matrix.sigma.kadambari.method.inheritance;

public class Child extends Parent{
    public void m1(){
        System.out.println("Child::m1 method");
    }

    public static void main(String[] args) {
        Child obj=new Child();
        obj.m1();
        obj.m2();

    }
}
