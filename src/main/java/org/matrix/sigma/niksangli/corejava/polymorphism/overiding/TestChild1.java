package org.matrix.sigma.niksangli.corejava.polymorphism.overiding;

public class TestChild1 extends Testparent1 {
    public void m1(int b) {
        System.out.println("this is int m1 child method" + b);
    }

    public static void m1(String s1) {
        System.out.println("this is string m1 child method" + s1);
    }

    public static void main(String[] args) {
        TestChild1 tc1 = new TestChild1();
        tc1.m1(12);//
        Testparent1 tp1 = new Testparent1();
        tp1.m1(20);

        Testparent1.m1("Pinky");

        Testparent1 tc2=new TestChild1();// here parent method call if both static
        tc2.m1("niki");



    }
}
