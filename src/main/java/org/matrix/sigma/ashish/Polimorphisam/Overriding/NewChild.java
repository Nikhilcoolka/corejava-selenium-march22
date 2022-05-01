package org.matrix.sigma.ashish.Polimorphisam.Overriding;

public class NewChild extends NewParent {

    public String m1(){
        System.out.println(" I am in Child m1 method");
        return "Ash";
    }

    public static void main(String[] args) {
        NewParent p=new NewChild();
              p.m1();//diff return type-covariant returntype

    }
}
