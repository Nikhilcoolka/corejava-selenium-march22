package org.matrix.sigma.niksangli.corejava.inheritance;

public class Parent extends GrandParent {
    int a = 20;
    int b = 30;

    public void m1() {
        System.out.println("This is parent m1 method");
    }

    public void m2() {
        System.out.println("This is parent m2 method");
        //System.out.println(super.a);   /// 1000
    }


    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.m2();

    }

}
