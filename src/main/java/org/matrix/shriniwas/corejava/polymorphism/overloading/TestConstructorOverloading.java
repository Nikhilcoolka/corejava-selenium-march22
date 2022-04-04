package org.matrix.shriniwas.corejava.polymorphism.overloading;

public class TestConstructorOverloading {

    public TestConstructorOverloading(int a) {
        System.out.println(a);
    }

    public TestConstructorOverloading() {
        System.out.println("0-args Constructor");
    }

    public TestConstructorOverloading(String str, int b) {
        System.out.println(str + b);
    }

    public static void main(String[] args) {
        new TestConstructorOverloading();
        new TestConstructorOverloading(10);
        new TestConstructorOverloading("Shriniwas", 20);
    }
}
