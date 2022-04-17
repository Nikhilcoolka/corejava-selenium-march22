package org.matrix.sigma.niksangli.corejava.polymorphism.overiding;

public class Child extends Parent
{
     public String m1()
     {
         System.out.println("Child m1 method");
         return "Nik";
     }

    public void m2()
    {
        System.out.println("i am in child m2 method");
    }

    public static void m3()
    {
        System.out.println("i am in static child m3 method");
    }

    public void m4()
    {
        System.out.println("i am in static child m4 method");
    }

    public static void main(String[] args)
    {
       // Child p1=new Child();

       // Child obj=new Child();
       // obj.m4();// i am in static child m4 method

      //  p1.m2(); //  i am in child m2 method
      //   m3(); //  i am in static child m3 method
        //p1.m3();// i am in static parent m3 method by default
       // Parent p2=new Parent();
      //  p1.m3();  //
      //  p1.m1();// Child m1 method
     //   p1.m1();  // Parent m1 method
       // Parent pp=new Child();
      Parent pp1=new Child();
        pp1.m1();
         pp1.m2();
         m3();
         Parent.m3();






    }
}
