package org.matrix.sigma.pankaj.corejava.accessspecifier;

public class ChildSpecifier {

    // you can access anywhere
    public void s1() {
        System.out.println("i am in ChildSpecifier :: s1 method");
    }

    // you cannot access outside class
    private void s2() {
        System.out.println("i ma in ChildSpecifier :: s2 method");
    }

    //within package
    //outside with inheritance relationship
    protected void s3() {
        System.out.println("i ma in ChildSpecifier :: s3 method");
    }

    // within a package only
    void s4() {
        System.out.println("in ChildSpecifier :: s4 method");
    }

    public static void main(String[] args) {
        ChildSpecifier obj = new ChildSpecifier();
        obj.s1();
        obj.s2();
    }
}
