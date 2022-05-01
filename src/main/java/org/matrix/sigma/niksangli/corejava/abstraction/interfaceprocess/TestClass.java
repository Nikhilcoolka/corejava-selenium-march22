package org.matrix.sigma.niksangli.corejava.abstraction.interfaceprocess;

import org.matrix.shriniwas.corejava.abstraction.interfaceconcept.TestInterface1;

public class TestClass implements Interface1, Interface2 {

    int a = 10;
    int b = 20;

    TestClass() {

    }

    public void click() {
        System.out.println("This is click method");
    }

    public void entertext() {
        System.out.println("This is enter text method");
    }

    public String getText() {
        return "Nikhil";
    }

    public void m1() {
        System.out.println("This is m1 method");
    }

    public final void m2() {
        System.out.println("This is final method");
    }

    public void add() {
        System.out.println("This is add method" + (a + b));
    }

    public void multiply() {
        System.out.println("This is multiply method" + (a * b));

    }

    public static void main(String[] args) {
        Interface1 ts1 = new TestClass();
        ts1.getText();

        Interface2 ts2 = new TestClass();
        ts2.getText();
        ts2.add();
        ts2.multiply();

        TestClass ts3 = new TestClass();
        ts3.getText();

        System.out.println(Interface1.ename);
        System.out.println(TestClass.ename);

        TestClass t = new TestClass();


    }
}
