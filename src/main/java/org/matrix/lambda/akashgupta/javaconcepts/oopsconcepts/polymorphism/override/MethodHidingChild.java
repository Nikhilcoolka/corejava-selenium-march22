package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.polymorphism.override;

public class MethodHidingChild extends MethodHidingParent {
    public void m1() {
        System.out.println("Child public method");
    }

    protected static void m2() {      //upgrade access specifier from private-->protected
        System.out.println("Child private method");
    }

    public static void m3() {         //upgrade access specifier from protected-->public
        m2();
        System.out.println("Child protected method");
    }

   /* private void m3(){         //downgrade access specifier from protected-->private not allowed
        this.m2();
        System.out.println("Child protected method");
    }*/

    public static void main(String[] args) {
        //method hiding is when you create parent ref = child obj;
        // here method hiding is invoked due to static method
        MethodHidingParent ref = new MethodHidingChild();
        ref.m1();       // method override(child overrides parent)
        ref.m3();      //method hiding

    }
}
