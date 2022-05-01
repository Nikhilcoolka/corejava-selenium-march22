package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.polymorphism.override;

public class MethodOverrideChild extends MethodOverrideParent {

    public void m1() {              //override in child class signature,parameters & return type must be same
        System.out.println("Child m1......override");
    }

    public int m1(int a) {          //overloading in same class LHS of signature doesn't matter
        System.out.println("Child m1......overloading");
        return 0;
    }

    public int m2() {
        System.out.println("Child m2......override");
        return 0;
    }

    public static void main(String[] args) {

        //parent ref = parent obj
        MethodOverrideParent parent = new MethodOverrideParent();
        parent.m1();        //parent overrides child
        parent.m2();
        //child ref = child obj
        MethodOverrideChild child = new MethodOverrideChild();
        child.m1();        //local override method
        child.m1(1);   //local overload method
        //Parent ref =child obj
        MethodOverrideParent obj = new MethodOverrideChild();
        obj.m1();      //child overrides parent
        obj.m2();
        // Compiler will check if m1() method is present in Parent class or not.
        // If yes, at Runtime JVM will call the method of whoever class object is created

        // Child ref and Parent Object
        // TestOverridingChild c1 = new TestOverridingParent();

    }
}
