package org.matrix.sigma.prajakta.corejava.polymorphism.overriding;

public class Child1 extends Parent1{

    // Question :: can we override the method by changing return type?
    // Answer :: Yes with the help of covariant return type

    //covariant return type :: Child (Integer)
    public Integer add(int x,int y ){
        return x+y;
    }

    public static void main(String[] args) {
        Parent1 obj=new Child1();
        System.out.println(obj.add(10,20));

    }
}
