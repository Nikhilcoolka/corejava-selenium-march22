package org.matrix.shriniwas.corejava.polymorphism.overloading;

public class TestOverloadTypePromotionWithAmbiguity {

    public void m1(int i, long j) {
        System.out.println(i+j);
    }

    public void m1(long i, int j) {
        System.out.println(i+j);
    }

    public static void main(String[] args) {
        TestOverloadTypePromotionWithAmbiguity obj = new TestOverloadTypePromotionWithAmbiguity();
        // obj.m1(10, 10); Ambiguity : Confused to call the m1() methods
    }
}
