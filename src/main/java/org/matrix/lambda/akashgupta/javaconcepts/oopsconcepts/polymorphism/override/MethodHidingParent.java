package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.polymorphism.override;

public class MethodHidingParent {
    public void m1() {
        System.out.println("Parent public method");
    }

    private static void m2() {
        System.out.println("Parent private method");
    }

    protected static void m3() {
        m2();
        System.out.println("Parent protected method");
    }

}
