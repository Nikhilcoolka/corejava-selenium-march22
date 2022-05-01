package org.matrix.sigma.kadambari.method.inheritance;

public class Parent1 extends Child1{
    public void m2(){
        System.out.println("Child class method");
    }

    public static void main(String[] args) {
        Parent1 obj=new Parent1();
        obj.m1();
        obj.m2();
    }
}
