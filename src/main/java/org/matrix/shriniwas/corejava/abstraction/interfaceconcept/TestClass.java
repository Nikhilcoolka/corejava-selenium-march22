package org.matrix.shriniwas.corejava.abstraction.interfaceconcept;

public class TestClass implements TestInterface1, TestInterface2 {

    public void click() {
        System.out.println("Click on button");
    }

    public void enterText() {
        System.out.println("Enter Text in input box");
    }

    public String getText() {
        return "Shriniwas";
    }

    public void m1() {
        System.out.println("I am in m1 method");
    }

    @Override
    public void add() {
        System.out.println("Addition");
    }

    @Override
    public void multiply() {
        System.out.println("Multiply");
    }

    public final void m4() {
        System.out.println("");
    }

    public static void main(String[] args) {
       // TestInterface1 obj = new TestInterface1(); // Can not create an Object of Interface

        TestInterface1 obj1 = new TestClass();
        obj1.getText();

        TestInterface2 obj2 = new TestClass();
        obj2.getText();

        TestClass obj3 = new TestClass();
        obj3.getText();

        System.out.println(empName);

       // TestInterface1.empName = "Alle"; // Can not reassign value to final variable

    }

}
