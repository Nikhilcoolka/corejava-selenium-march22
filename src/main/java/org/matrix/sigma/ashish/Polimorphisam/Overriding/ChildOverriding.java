package org.matrix.sigma.ashish.Polimorphisam.Overriding;

public class ChildOverriding extends ParentOverriding {
    
    public void m1(){
        System.out.println("I am in Child Overriding");
    }

    public void  m1(int a){
        System.out.println("I am in Child m1[int] method");
    }

    public void m1(String str){
        System.out.println("I am in Child m1[string] method");
    }

    public static void main(String[] args) {

        ParentOverriding obj=new ParentOverriding();//Parent Ref and Parent Object
        obj.m1(20);
        obj.m1();
        System.out.println(" ");

        ChildOverriding obj1=new ChildOverriding();//Child Ref and Child obj
        obj1.m1();
        System.out.println(" ");

        ParentOverriding p=new ChildOverriding();//Parent Ref and Child obj
        p.m1();//actual overriding concept parent ref but child obj
        p.m1(30);
        p.m1("Ashish");

        }
    }

