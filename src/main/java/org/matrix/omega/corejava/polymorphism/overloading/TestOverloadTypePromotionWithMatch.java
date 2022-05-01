package org.matrix.omega.corejava.polymorphism.overloading;

public class TestOverloadTypePromotionWithMatch {

    public void m1(int i, long j) {
        System.out.println(i);
    }

    public void m1(long a) {
        System.out.println(a);
    }

    public void m1(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        TestOverloadTypePromotionWithMatch obj = new TestOverloadTypePromotionWithMatch();
        obj.m1(10); // It will call m1(int a) method as it found exact match
    }
}
