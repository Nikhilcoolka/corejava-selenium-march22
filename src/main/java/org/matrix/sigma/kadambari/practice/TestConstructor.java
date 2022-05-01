package org.matrix.sigma.kadambari.practice;

public class TestConstructor {
    int x, y; // instance variable

    TestConstructor(int a, int b)//
    {


        x = a;
        y = b;
        System.out.println("x: " + a);
        System.out.println("y: " + b);
        System.out.println("parameterize constructer ");

    }

    public static void main(String[] args) {
        TestConstructor obj = new TestConstructor(10, 20);

    }

}
