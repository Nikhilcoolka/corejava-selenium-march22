package org.matrix.sigma.ashish.Method;

public class UseThis {
    Employee ee=new Employee();

    public void m1(){
        System.out.println("I am in child class UseThis Class");
       // System.out.println(" ");
    }

    public void m2(){
        this.m1();
        System.out.println("I am in child class m2 method");
        //System.out.println(" ");
    }

    public String m3(){
        this.m2();
        System.out.println(" ");
        //m1();
        String str="AshishThopate";
        return str;

    }

    public static void main(String[] args) {
        UseThis obj=new UseThis();
        obj.m3();
    }
}
