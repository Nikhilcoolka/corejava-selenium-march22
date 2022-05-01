package org.matrix.sigma.prajakta.corejava.polymorphism.overriding;

public class Child extends Parent{

    //method overriding concept

    /*
       Rule 1 : method same name and same parameters in different class i.e. child and parent class
       Rule 2 : overriding done with child and parent classes i.e. inheritance relationship (is-A relationship)
       Rule 3 : data types of parameters should be same.
       Rule 4 : sequence of parameters should also same.
     */

    Child(){
        //parent class constructor can not override
    }

    public void m1(){
        System.out.println("Child m1 method");
    }

    public void add(int x,int y){
        System.out.println("child class add()::"+(x+y));
    }

    public static void main(String[] args) {
        //child ref child object
        Child obj=new Child();
        obj.m1();

        //parent ref parent object
        Parent obj2=new Parent();
        obj2.m1();

        //parent ref child object
        Parent obj3=new Child();
        obj3.m1();

         //compiler will check if m1() is present in parent class or not.
         //if yes , then jvm will call the method whoever class object is created.

        obj3.add(10,20);

    }
}
