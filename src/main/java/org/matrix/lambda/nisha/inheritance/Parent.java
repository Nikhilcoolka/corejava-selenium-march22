package org.matrix.lambda.nisha.inheritance;

public class Parent extends GrandParent{

    int d = 4;
    int i = 786;

    public void m2() {
        System.out.println("Parent :: m2 Method");
    }

    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.m2();
        obj.m3();
    }

}

