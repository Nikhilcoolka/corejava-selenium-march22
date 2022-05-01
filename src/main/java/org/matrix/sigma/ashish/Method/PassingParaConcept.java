package org.matrix.sigma.ashish.Method;

public class PassingParaConcept {
    public void m1(int a, String str) {
        System.out.println(a);
        System.out.println(str);
    }

    public void m1(int a) {
        System.out.println(a);

    }

    public static void main(String[] args) {
        PassingParaConcept obj = new PassingParaConcept();
        System.out.println("Concept polymorphism");
        obj.m1(10, "Ashish");
        System.out.println("in same method name but passing different parameters");
        obj.m1(10);
    }
}
