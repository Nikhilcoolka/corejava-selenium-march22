package org.matrix.shriniwas.corejava.abstraction.abstractclass;

public abstract class TestClass extends TestAbstractClass {

    TestClass() {
        System.out.println("In TestClass Constructor..");
    }

    public void saving() {
        System.out.println("Enter password for saving account");
    }

    public void cashWithdraw() {
        System.out.println("I am in cash withdraw method");
    }

    public static void main(String[] args) {
        // TestClass obj = new TestClass();
        // obj.saving();

        // We can not create an Object of Abstract class
        // TestAbstractClass obj1 = new TestAbstractClass();
        // obj1.m1();
        // obj1.saving();
    }
}
