package org.matrix.lambda.akashgupta.javaconcepts.corejava.methods;
/*   ..........................WITH IMPORT For same package classes.......................*/

import static org.matrix.lambda.akashgupta.javaconcepts.corejava.methods.TestLocalMethodCalling.interClassStatic;
//import static org.matrix.lambda.akashgupta.javaconcepts.methods.TestLocalMethodCalling.interClassStatic;

public class TestInterClassCalling2 {
    static TestLocalMethodCalling obj = new TestLocalMethodCalling();

    static void currentClassSMethod() {
        System.out.println("\nCurrent class s-Method............................start");
        System.out.println("Calling of i-Method  from diff class:\n" +
                "Use of ...'object.'... access\n" +
                ">>>staticObj.interClassInstance();");
        obj.interClassInstance();
        //interClassInstance();       //can't call directly because scope of instance is within its own class
        System.out.println("Calling of s-Method from diff class");
        System.out.println("direct access by import :\n" +
                ">>>interClassStatic();");
        interClassStatic();//can't call directly unless static import
        System.out.println("Current class s-Method.............end");
    }

    public static void main(String[] args) {
        System.out.println("Main.....");
        TestInterClassCalling2 obj = new TestInterClassCalling2();
        System.out.println("Calling static-Method from different class directly\n" +
                "BUT u have import the package\n"
                + ">>>interClassStatic();");
        interClassStatic();
        obj.currentClassIMethod();
        currentClassSMethod();
        System.out.println(".......Main");

    }

    void currentClassIMethod() {
        System.out.println("\nCurrent class i-Method............................start");
        System.out.println("Calling of i-Method from diff class:\n" +
                "Use of ...'object.'... access\n" +
                ">>>Obj.interClassInstance();");
        obj.interClassInstance();     // instance method can only be access by object. creation.
        System.out.println("Calling of s-Method from diff class");
        System.out.println("direct access by import :\n" +
                ">>>interClassStatic();");
        interClassStatic();             //can call directly unless import
        System.out.println("Current class i-Method.............end\n");
    }
}
