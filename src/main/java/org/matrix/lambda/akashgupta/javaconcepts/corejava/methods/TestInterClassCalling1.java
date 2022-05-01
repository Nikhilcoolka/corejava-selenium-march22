package org.matrix.lambda.akashgupta.javaconcepts.corejava.methods;

/*   ..........................WITHOUT IMPORT For same package classes.......................*/
public class TestInterClassCalling1 {
    static TestLocalMethodCalling staticObj = new TestLocalMethodCalling();

    static void currentClassSMethod() {
        System.out.println("Current class s-Method............................start");
        System.out.println("Calling of i-Method  from diff class:\n" +
                "Use of ...'object.'... access\n" +
                ">>>staticObj.interClassInstance();");
        staticObj.interClassInstance();
        //interClassInstance();       //can't call directly because scope of instance is within its own class
        System.out.println("Calling of s-Method from diff class\n");
        System.out.println("Use of ...'classname.'... access :\n" +
                ">>>TestLocalMethodCalling.interClassStatic();");
        TestLocalMethodCalling.interClassStatic();//can't call directly unless import
        System.out.println("Current class s-Method.............end");

    }

    public static void main(String[] args) {
        TestLocalMethodCalling localObj = new TestLocalMethodCalling();
        TestInterClassCalling1 obj = new TestInterClassCalling1();
        obj.currentClassIMethod();
        currentClassSMethod();
        System.out.println("Main.....");
        System.out.println("Calling Instance Method from different class:\n" +
                "You need to create an object of class whose method's ur calling\n" +
                "by creating static/local obj\n" +
                ">>>staticObj.interClassInstance();");
        staticObj.interClassInstance();
        System.out.println("\n>>>localobj.interClassInstance();");
        localObj.interClassInstance();
        System.out.println("\nStatic-Method calling ...\n" +
                "If class is present in same package and don't want to import,\n" +
                "Use classname. access :");
        System.out.println(">>>TestLocalMethodCalling.interClassStatic();");
        TestLocalMethodCalling.interClassStatic();
        //interClassStatic();     // need to import package.class for direct access.
        System.out.println(".......Main");
    }

    void currentClassIMethod() {
        System.out.println("Current class i-Method............................start");
        System.out.println("Calling of i-Method from diff class:\n" +
                "Use of ...'object.'... access\n" +
                ">>>staticObj.interClassInstance();");
        staticObj.interClassInstance();
        //interClassInstance();       //can't call directly because scope of instance is within its own class
        System.out.println("Calling of s-Method from diff class\n");
        System.out.println("Use of ...'classname.'... access :\n" +
                ">>>TestLocalMethodCalling.interClassStatic();");
        TestLocalMethodCalling.interClassStatic();//can't call directly unless import
        System.out.println("Current class i-Method.............end");
    }
}
