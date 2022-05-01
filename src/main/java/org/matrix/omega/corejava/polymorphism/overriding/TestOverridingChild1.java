package org.matrix.omega.corejava.polymorphism.overriding;

public class TestOverridingChild1 extends TestOverridingParent1 {

    public void m1(int i) {
        System.out.println("I am in Child:: m1(int) method");
    }

    public void m1(String str) {
        System.out.println("I am in Child:: m1(String) method");
    }

    public static void main(String[] args) {

        // Parent ref and Parent Object
        TestOverridingParent1 parent = new TestOverridingParent1();
        parent.m1(10);
        // Compiler will check if m1() method is present in Parent class or not.
        // If yes, at Runtime JVM will call the method of whoever class object is created

        // Child ref and Child Object
        TestOverridingChild1 child = new TestOverridingChild1();
        child.m1(10);

        // Parent ref and Child Object
        TestOverridingParent1 p1 = new TestOverridingChild1();
        p1.m1(10);
        p1.m1("Shriniwas");

        // Compiler will check if m1() method is present in Parent class or not.
        // If yes, at Runtime JVM will call the method of whoever class object is created

        // Child ref and Parent Object
        // TestOverridingChild c1 = new TestOverridingParent();
    }
}
