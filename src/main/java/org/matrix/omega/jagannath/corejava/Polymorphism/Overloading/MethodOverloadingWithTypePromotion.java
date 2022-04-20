package org.matrix.omega.jagannath.corejava.Polymorphism.Overloading;

public class MethodOverloadingWithTypePromotion {
    public void m1(int a)
    {
     System.out.println("It will print the ASCII value of A :");
     System.out.println(a);
    }
    public void m1(int x,int y)
    {
          System.out.println(x+y);
    }
    public static void main(String[] args)
    {
      MethodOverloadingWithTypePromotion obj=new MethodOverloadingWithTypePromotion();
      obj.m1('A');
      obj.m1(10,30);
    }
}
