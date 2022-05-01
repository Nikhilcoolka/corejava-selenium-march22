package org.matrix.delta.rahul.methodoverriding;

public class MethodOverridingChild extends MethodOverridingParent {
    public void m1() {
        System.out.println("child m1");
    }
    public int m2() {
        System.out.println("child m2");
        return 10;
    }

    public static void main(String[] args) {
        MethodOverridingChild obj=new MethodOverridingChild();
        obj.m1();
        obj.m2();
        MethodOverridingParent obj2=new MethodOverridingParent();
        obj2.m1();
        obj2.m2();
        MethodOverridingParent p=new MethodOverridingChild();
        p.m1();
        p.m1();
    }
}
