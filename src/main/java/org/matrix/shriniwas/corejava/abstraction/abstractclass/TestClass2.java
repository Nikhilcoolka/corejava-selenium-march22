package org.matrix.shriniwas.corejava.abstraction.abstractclass;

public class TestClass2 extends TestClass {

    @Override
    public void current() {
        System.out.println("I am in current method");
    }

    public static void main(String[] args) {
        TestClass2 obj = new TestClass2();

        TestClass obj1 = new TestClass2();
        // here, we are creating an Object of Child and reference of Parent

    }
}
