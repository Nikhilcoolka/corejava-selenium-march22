package org.matrix.sigma.pankaj.corejava.oopsconcept.polymorphism.overloading;

public class TestOverloading1 {

    public void add(int a, int b) {
        System.out.println(a + b);

    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);

    }
    public void p1(String str){
        System.out.println("i am in p1 method");
    }

    public void p2(int a ,String str){
        System.out.println("i am in p2 method");
    }
    public void p2(String str, int a){
        System.out.println("i am in p2 method");
    }

    public static void main(String[] args) {
        TestOverloading1 obj = new TestOverloading1();
        obj.add(50, 60);
        obj.add(50, 60, 70);
        obj.p1("pankaj");
        obj.p2(10,"pk");

    }

}
