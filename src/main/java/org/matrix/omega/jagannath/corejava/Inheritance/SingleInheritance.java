package org.matrix.omega.jagannath.corejava.Inheritance;

public class SingleInheritance { //Parent class
    int a=200;
    


}
class Child extends SingleInheritance{ //Child Class
    int b=100;
}
class Parent{
    public static void main(String[] args)
    {
        Child obj=new Child();

        System.out.println("Parent variable :"+obj.a);
        System.out.println("Child Variable :"+obj.b);
    }
}