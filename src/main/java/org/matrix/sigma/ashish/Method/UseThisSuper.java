package org.matrix.sigma.ashish.Method;

public class UseThisSuper extends TestThisSuper {
    public void m1() {
        System.out.println("I am in Child Class");
        System.out.println(" ");
    }

    public void m2() {
        this.m1();
        System.out.println("use of super Keyword");
        super.m1();
    }

    public String m3() {
        this.m2();
        String str = "I am in Return use m3 method";
        return str;

    }

    public static void main(String[] args) {

        System.out.println("Use of this Keyword");
        UseThisSuper obj = new UseThisSuper();
        // obj.m2();
        String str1 = obj.m3();
        System.out.println("  ");
        System.out.println(str1);

    }
}
