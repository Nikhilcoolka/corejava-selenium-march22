package org.matrix.omega.jagannath.corejava.Polymorphism.Overloading;

public class ConstructorOverloading {
    public ConstructorOverloading(int a)
    {
        System.out.println("Single parameter constructor "+a);
    }
    public ConstructorOverloading(String str,int b)
    {
        System.out.println("Two parameterize constructor type string and int");
        System.out.println(str+" "+b);
    }
    public ConstructorOverloading()
    {
        System.out.println("I am in without parameterize constructor ");
    }
    public static void main(String[] args)
    {
        //It gives Warning:(19, 42) Instantiation of utility class 'ConstructorOverloading'

         ConstructorOverloading obj=new ConstructorOverloading();  //calling without parametrise constructor
        new ConstructorOverloading("Jagannath",20);//calling two parametrise constructor
        new ConstructorOverloading(100); ////calling single  parametrise constructor

        //without reference variable create obj and calling to constructor
        //While commit it will give the warning of utility
      /*  new ConstructorOverloading();  //calling without parametrise constructor
        new ConstructorOverloading("Jagannath",20);//calling two parametrise constructor
        new ConstructorOverloading(100); ////calling single  parametrise constructor
    */
    }


}
