package org.matrix.lambda.akasht.corejava.methods;

public class TestMethodReturnType {

    public int addition(int a , int b) {
        int c = a + b;
        return c;
    }

    public int multiplication(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public String getName(String name) {
        return name;
    }

    public static void main(String[] args) {
        TestMethodReturnType obj = new TestMethodReturnType();
        int add = obj.addition(200, 40);
        int mul = obj.multiplication(200, 400);
        System.out.println(add);
        System.out.println(mul);

        String str = obj.getName("Akash");
        System.out.println(str);
    }
}

