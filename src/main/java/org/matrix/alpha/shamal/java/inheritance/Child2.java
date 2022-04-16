package org.matrix.alpha.shamal.java.inheritance;

public class Child2 extends Parent{

    public void m1(){
        System.out.println("This si the child2 class");
    }

    public void m2(){
        System.out.println("I am in Child2 class");
    }

    public static void main(String[] args) {
        Child2 ch = new Child2();
        Child1 c = new Child1();
        System.out.println("This is the Child1 class instance variable" +c.a);
        c.m1();
        c.m2();
        ch.parentM1();
        c.parentM1();
        System.out.println("This is from the GrandParent Class :" +c.s);
    }
}
