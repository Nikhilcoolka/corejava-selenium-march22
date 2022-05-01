package org.matrix.shriniwas.corejava.accessspecifier;

public class ChildSpecifier {

    // You can access anywhere
    public void m1() {
        System.out.println("In ChildSpecifier:: m1 method");
    }

    // You can access outside this class
    private void m2() {
        System.out.println("In ChildSpecifier:: m2 method");
    }

    // Within a package
    // Outside package with inheritance relationship
    protected void m3() {
        System.out.println("In ChildSpecifier:: m3 method");
    }

    // Within a package only
    void m4() {
        System.out.println("In ChildSpecifier:: m4 method");
    }

    public static void main(String[] args) {
        ChildSpecifier obj = new ChildSpecifier();
        obj.m2();
    }
}
