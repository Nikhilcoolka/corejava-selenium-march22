package org.matrix.omega.corejava.polymorphism.overloading;

public class TestOverloading1 {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int aa, int bb, int cc) {
        System.out.println(aa + bb + cc);
    }

    public void m1(String str) {
        System.out.println("I am in m1 method");
    }

    public void m1(int a) {
        System.out.println("I am in getName method");
    }

    public void m2(int a, String str) {
        System.out.println("I am in m2 method");
    }

    public void m2(String a, int str) {
        System.out.println("I am in m2 method");
    }

    public static void m3(String str) {
        System.out.println("In static m3 string method");
    }

    public static void m3(boolean b) {
        System.out.println("In static m3 boolean method");
    }

    public static void main(String[] args) {
        TestOverloading1 obj = new TestOverloading1();
        obj.add(10, 20);
        obj.add(10, 20, 30);

        obj.m1(10);
        obj.m1("Shriniwas");

        obj.m2(10, "Shriniwas1");
        obj.m2("Shri", 100);

        int [] arr = {10, 20, 30};
        main(arr);

        m3(true);
        m3("shri");
        // m3(10);
    }

    public static void main(int[] a) {
        System.out.println("In main method");
    }
}
