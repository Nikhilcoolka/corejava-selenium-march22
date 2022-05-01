package org.matrix.delta.rahul.inheritance;

public class Child extends Parant {
    int a = 100;

    public Child() {
        //super(); it automatically call the Grandfather constructor
        System.out.println("I am the Child class Constructor");
    }

    public void m1() {
        System.out.println("Its a Child class method m1");
        super.m1();//called parent class method
        super.m2();//called GrandFather Method.
        super.m3();//called Grandfather Method.
        System.out.println(this.a);// called current class variable a
        System.out.println(super.a);//called parent class variable a
        System.out.println(b);
        System.out.println(c);

    }

    public static void main(String[] args) {
        Child c = new Child();
        c.m1();
        System.out.println(c.c);


    }
}
