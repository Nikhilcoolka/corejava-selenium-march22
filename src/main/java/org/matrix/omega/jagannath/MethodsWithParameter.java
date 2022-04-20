package org.matrix.omega.jagannath;

public class MethodsWithParameter {
    public void method3(int age)
    {
        System.out.println("My age is :"+age);
    }
    public static void method4(int age)
    {
        System.out.println("This is static method: "+age);
    }
    public static void main(String[] args)
    {
        MethodsWithParameter obj=new MethodsWithParameter();
        obj.method3(100);
        method4(30);
        MethodsWithParameter.method4(25);
    }
}
