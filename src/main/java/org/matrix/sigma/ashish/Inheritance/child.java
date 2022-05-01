package org.matrix.sigma.ashish.Inheritance;

public class child extends parent {
    int a =70;

    public child(){
       this("Ashish");
        System.out.println("I am in child constructor");
    }

    public child(String name){
        System.out.println("Child parametrical Constructor calling "+name);
    }
    public void m1(){
        System.out.println("I am in Child Class");
        System.out.println("Age of Grandparent Class in function  "+gage);
        System.out.println("Age of parent class in function  "+age);

        System.out.println("----------------------------------------------");
        System.out.println("Accesing same variable names from parent and child");
        System.out.println("Acces parent variable using super  "+super.a);
        System.out.println("access child variable using this  "+this.a);

        System.out.println("-------------------------------------------------");
        System.out.println("accesing parent class method using super");
        super.m1();

    }

    public static void main(String[] args) {
         child obj=new child();
        obj.m3();
         obj.m2();
        obj.m1();
        System.out.println("----------------------------------------");
        System.out.println("age of grand parent class in main method   "+obj.gage);
        System.out.println("Age of parent class in main method  "+obj.age);

        System.out.println("-----------------------------------------------");
       // new parent();
        System.out.println("Extra Line");
        System.out.println("Extra Line1");

    }
}
