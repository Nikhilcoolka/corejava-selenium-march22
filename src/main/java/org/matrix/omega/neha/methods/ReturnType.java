package org.matrix.omega.neha.methods;

public class ReturnType {
    public int addition(int a, int b) {
        int c = a + b;
        return c;
    }


    public static void main(String[] args) {
        ReturnType obj = new ReturnType();
        int add = obj.addition(10, 20);

        System.out.println(add);

    }
}
