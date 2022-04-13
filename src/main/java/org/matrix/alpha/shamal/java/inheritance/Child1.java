package org.matrix.alpha.shamal.java.inheritance;

public class Child1 extends Parent{

    public void m1(int a){

    }
    public void m1(){
        System.out.println("This si the child class");
    }

    public void m2(){

        System.out.println("I am in Child2 class" +super.a);
    }

    public static void main(String[] args) {
        Child1 ch = new Child1();
        ch.parentM1();
        ch.m2();
        System.out.println("The value of a is" +ch.a);
        System.out.println();
        System.out.println("Hi I am from GrandParentClass" +ch.s);
        System.out.println("Hi I am From Parent class" +ch.b);

    }
}
