package org.matrix.delta.rahul;

public class MethodWithRetunType {
    public int getData(int a) {
        return a;
    }

    public int mul(int a, int b) {
        // int mul = a * b;
        return a + b;
    }

    public static void main(String[] args) {
        MethodWithRetunType m = new MethodWithRetunType();
        int n = m.getData(21);
        //System.out.println(m.getData(21));
        System.out.println(n);
        int k = m.mul(10, 20);
        System.out.println("Multiplication is " + k);//first way to call return method.
        System.out.println("Multiplication is " + m.mul(10, 20));// second way we can call return method.
    }
}


