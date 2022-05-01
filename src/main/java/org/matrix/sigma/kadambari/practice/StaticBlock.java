package org.matrix.sigma.kadambari.practice;

public class StaticBlock {
    static int a;
    static int b;
    static{
        System.out.println("Static block intialized.");
        a=12; b=20;
    }

    public static void method(){
        System.out.println("a =" +a);
        System.out.println("b ="+b);
    }

    public static void main(String[] args) {
        method();
    }
}
