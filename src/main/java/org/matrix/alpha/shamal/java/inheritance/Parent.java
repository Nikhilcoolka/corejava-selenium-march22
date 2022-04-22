package org.matrix.alpha.shamal.java.inheritance;

public class Parent extends GrandParent{

    int a = 20;
    String s= "Shamal";
    int b = 30;

    public void parentM1(){
        System.out.println("This is the Parent Class");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.parentM1();
        System.out.println(p.a);
        System.out.println(p.b);
    }

}
