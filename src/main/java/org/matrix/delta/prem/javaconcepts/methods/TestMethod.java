package org.matrix.delta.prem.javaconcepts.methods;

public class TestMethod {
    public void addition(int a, int b) {
        int c = a + b;
        System.out.println("Addition is = " + c);
    }


    public void Substraction(int a, int b) {
        int c = a - b;
        System.out.println("Substraction is = " + c);
    }

    public void multiplication(int a, int b) {
        int c = a * b;
        System.out.println("Multiplication is = " + c);
    }

    public void division(int a, int b) {
        int c = a / b;
        System.out.println("Division is = " + c);
    }


    public static void main(String[] args) {
        TestMethod obj = new TestMethod();
        obj.addition(45, 50);
        obj.Substraction(50, 13);
        obj.multiplication(95, 4);
        obj.division(1250, 25);
    }
}
