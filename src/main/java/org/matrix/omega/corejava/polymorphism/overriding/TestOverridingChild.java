package org.matrix.omega.corejava.polymorphism.overriding;

public class TestOverridingChild extends TestOverridingParent {

    public void m1() {
        System.out.println("I am in Child:: m1 method");
    }

    public static void main(String[] args) {

        // Parent ref and Parent Object
        TestOverridingParent parent = new TestOverridingParent();
        parent.m1();

        // Compiler will check if m1() method is present in Parent class or not.
        // If yes, at Runtime JVM will call the method of whoever class object is created

        // Child ref and Child Object
        TestOverridingChild child = new TestOverridingChild();
        child.m1();


        // Parent ref and Child Object
        TestOverridingParent p1 = new TestOverridingChild();
        p1.m1();


        // Compiler will check if m1() method is present in Parent class or not.
        // If yes, at Runtime JVM will call the method of whoever class object is created

        // Child ref and Parent Object
        // TestOverridingChild c1 = new TestOverridingParent();

    }
}
