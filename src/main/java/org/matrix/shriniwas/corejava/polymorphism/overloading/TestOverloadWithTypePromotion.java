package org.matrix.shriniwas.corejava.polymorphism.overloading;

public class TestOverloadWithTypePromotion {

    public void m1(int i) {
        System.out.println(i);
    }

    public void m1(int a, int b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        TestOverloadWithTypePromotion obj = new TestOverloadWithTypePromotion();
        obj.m1('A'); // Type promotion from char to int
        obj.m1(10, 20);
    }
}
