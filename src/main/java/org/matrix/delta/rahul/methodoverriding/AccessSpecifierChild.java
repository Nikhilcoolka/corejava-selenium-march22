package org.matrix.delta.rahul.methodoverriding;

import org.matrix.delta.rahul.method.DefaultTest;

public class AccessSpecifierChild extends AccessSpecifierParent{
    public void m1() {
        System.out.println("child m1");
    }

    public static void main(String[] args) {
        AccessSpecifierChild obj=new AccessSpecifierChild();
        obj.m1();
        AccessSpecifierParent obj2=new AccessSpecifierParent();
        obj2.m1();
        AccessSpecifierParent p=new AccessSpecifierChild();
        p.m1();
        DefaultTest d=new DefaultTest();
        d.m1();

    }
}
