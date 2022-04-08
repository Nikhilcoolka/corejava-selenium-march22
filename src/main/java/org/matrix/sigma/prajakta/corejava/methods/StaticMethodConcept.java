package org.matrix.sigma.prajakta.corejava.methods;

public class StaticMethodConcept {

    public static void getData(int age){
        System.out.println("My age is:"+age);
    }

    public  static int add(int a,int b){
        int add=a+b;
        return  add;
    }

    public static void main(String[] args) {
        getData(20);
       //add() return addition so we can get addition in c variable.
       int c=add(10,20);
        System.out.println("Addition="+c);
    }
}
