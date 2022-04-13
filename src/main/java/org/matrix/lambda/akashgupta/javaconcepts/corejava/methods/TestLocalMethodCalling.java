package org.matrix.lambda.akashgupta.javaconcepts.corejava.methods;

public class TestLocalMethodCalling {
    public TestLocalMethodCalling() {
        System.out.println("Constructor invoked ie. obj is created of TestLocalMethodCalling");
    }

    public static void interClassStatic() {
        System.out.println("This method is in class-TestLocalMethodCalling of following package:\n"
                + "'org.matrix.lambda.akashgupta.javaconcepts'");
    }

    public static void sMethod() {
        System.out.println(".....This is static method.....");
    }

    public static void main(String[] args) {
        System.out.println("You are in main():\n" +
                "You can not call instance method directly in 'static-method'"
                + "\nYou have to create class object first:");
        TestLocalMethodCalling obj = new TestLocalMethodCalling();
        System.out.println(">>>obj.iMethod1();");
        obj.iMethod1();
        System.out.println("you can call static variable/method directly:\n>>>sMethod();");
        sMethod();
        System.out.println("you can call static variable/method by 'classname.' reference also:"
                + "\n>>>TestLocalMethodCalling.sMethod();");
        TestLocalMethodCalling.sMethod();
    }

    public void iMethod1() {
        System.out.println(".......This is instance iMethod1.......");
        System.out.println("You can call instance method directly, in another instance method\n"
                + "eg: Calling iMethod2 directly in iMethod1:\n>>>iMethod2();");
        iMethod2();
    }

    public void iMethod2() {
        System.out.println("......This is iMethod2.......");
    }

    public void interClassInstance() {
        System.out.println("This method is in class-TestLocalMethodCalling of  following package:\n"
                + "'org.matrix.lambda.akashgupta.javaconcepts'");
    }
}
