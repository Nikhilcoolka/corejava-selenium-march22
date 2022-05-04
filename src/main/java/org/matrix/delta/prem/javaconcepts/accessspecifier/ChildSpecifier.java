package org.matrix.delta.prem.javaconcepts.accessspecifier;

public class ChildSpecifier extends ParentSpecifier {

    public void m1(){
        System.out.println("this is public of child");
    }

    public static void main(String[] args) {
        ParentSpecifier obj = new ParentSpecifier();
        obj.m1();
    }
}
