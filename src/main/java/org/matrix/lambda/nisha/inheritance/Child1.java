package org.matrix.lambda.nisha.inheritance;

public class Child1 extends Parent{

    int i = 45;

    public void m1() {
        System.out.println("Child1 :: m1 method");
        System.out.println(this.i);
        System.out.println(super.i);
        System.out.println(d);
    }

    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.m1();
        obj.m2();
        System.out.println(obj.d);          // calling instance variable


        //System.out.println(d);              // non static keyword

    }
}

