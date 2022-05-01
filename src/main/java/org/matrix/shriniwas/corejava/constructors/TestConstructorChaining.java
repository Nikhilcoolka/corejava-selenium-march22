package org.matrix.shriniwas.corejava.constructors;

public class TestConstructorChaining {

    public TestConstructorChaining() {
        this(10, "Shri2");
        System.out.println("I am in no-args constr");
    }

    public TestConstructorChaining(int age) {
        System.out.println("I am in single param constr");
    }

    public TestConstructorChaining(int age, String name) {
        this(100);
        System.out.println("I am in 2 param constr");
    }

    public static void main(String[] args) {
        TestConstructorChaining obj = new TestConstructorChaining();
    }
}
