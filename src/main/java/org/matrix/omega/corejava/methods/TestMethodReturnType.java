package org.matrix.omega.corejava.methods;

public class TestMethodReturnType {

    public int addition(int a, int b) {
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
        int add = obj.addition(100, 20);
        int mul = obj.multiplication(10, 20);
        System.out.println(add);
        System.out.println(mul);

        String str = obj.getName("Shriniwas");
        System.out.println(str);
    }
}
