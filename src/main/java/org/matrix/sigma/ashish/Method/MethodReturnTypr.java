package org.matrix.sigma.ashish.Method;

public class MethodReturnTypr {

    public int m1(int a, int b) {
        int c = a + b;
        return c;//return value
    }

    public int m2(int a, int b) {
        int c = a * b;
        return c;//return value

    }

    public String GetName(String name) {
        return name;
    }

    public static void main(String[] args) {
        MethodReturnTypr obj = new MethodReturnTypr();

        int c = obj.m1(10, 20);//take value in c
        int d = obj.m2(10, 20);//take value in d
        System.out.println("name   " + obj.GetName("Ashish"));


        System.out.println("addition  " + c);
        System.out.println(("Multiplication  " + d));
    }
}
