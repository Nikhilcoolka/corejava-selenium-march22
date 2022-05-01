package org.matrix.sigma.niksangli.corejava.AccessSpecifier;

public class Parentspecifier {
    public void m1()  //You can access anywhere
    {
        System.out.println("This is parent public m1 method");
    }

    private void m2()  //  You can not access outside this class
    {
        System.out.println("This is parent private m2 method");
    }

    //Within a package
    // Outside package with inheritance relationship
    protected void m3() {
        System.out.println("This is parent protected m3 method");
    }

    void m4()  // // Within a package only this default method
    {
        System.out.println("This is parent default m4 method");
    }

    public static void main(String[] args) {
        Parentspecifier p = new Parentspecifier();
        p.m2();
    }
}
