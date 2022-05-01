package org.matrix.delta.prem.javaconcepts.methods;

public class TestMethodReturnType {
    public int addition(int a, int b) {
        int c = a + b;
        return c;
    }

    public int Substraction(int a, int b) {
        int c = a - b;
        return c;
    }

    public int multiplication(int a, int b) {
        int c = a * b;
        return c;
    }

    public int division(int a, int b) {
        int c = a / b;
        return c;
    }


    public static void main(String[] args) {
        TestMethodReturnType obj = new TestMethodReturnType();
        int add = obj.addition(15, 74);
        System.out.println(add);

        int sub = obj.Substraction(95, 45);
        System.out.println(sub);

        int mul = obj.multiplication(8, 9);
        System.out.println(mul);

        int div = obj.division(950, 50);
        System.out.println(div);

    }


}
