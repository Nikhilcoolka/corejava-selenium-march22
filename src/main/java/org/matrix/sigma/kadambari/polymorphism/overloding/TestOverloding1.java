package org.matrix.sigma.kadambari.polymorphism.overloding;

public class TestOverloding1 {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int aa, int bb, int cc) {
        System.out.println(aa + bb + cc);

    }

    public void getData(String str) {
        System.out.println(" I m in method geData");
    }

    public void getData(int a) {
        System.out.println("I m in method getData ");
    }

    public void m1(int a, String str) {
        System.out.println("I m in m1 method");
    }

    public void m1(String str, int a) {
        System.out.println("I m in m1 method");
    }

    public static void main(String[] args) {
        TestOverloding1 obj = new TestOverloding1();
        obj.add(20, 10);
        obj.add(10, 5, 30);
        obj.getData(25);
        obj.getData("shravi");
        obj.m1(25,"shri");
        obj.m1("Shravi",4);

    }
}