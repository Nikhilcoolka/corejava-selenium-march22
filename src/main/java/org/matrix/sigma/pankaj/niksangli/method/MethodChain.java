package org.matrix.sigma.niksangli.method;

public class MethodChain {
    public void m1() {
        System.out.println("This is m1 method");
    }

    public void m2() {
        System.out.println("This is m2 method");
        m3();
    }

    public void m3() {
        System.out.println("This is m3 method");
    }

    public static void main(String[] args) {
        MethodChain mc1 = new MethodChain();
        mc1.m1();
        //mc1.m2();
        mc1.m3();
    }
}
