package org.matrix.shriniwas.corejava.methods;

public class TestMethodsWithThisKeyword {

    public void m1() {
        System.out.println("I am in m1 method");
    }

    public void m2() {
        this.m1();
        System.out.println("I am in m2 method");
    }

    public String m3() {
        this.m1();
        m2();
        return "I am in m3 method";
    }

    public static void main(String[] args) {
        TestMethodsWithThisKeyword obj = new TestMethodsWithThisKeyword();
        // obj.m2();
        String str = obj.m3();
        System.out.println(str);
    }
}
