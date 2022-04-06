package org.matrix.sigma.niksangli.method;

public class TestMethodReturn
{

    public int addition(int a,int b)
    {
        int c=a+b;
        return c;

    }
    public double multiplication(double a,double b)
    {
        double d=a*b;
        return d;
    }

   public String getname(String s1)
   {
       return s1;
   }

    public static void main(String[] args)
    {
        TestMethodReturn Tm1=new TestMethodReturn();
        int add=Tm1.addition(30,50);
        double mul=Tm1.multiplication(32.10,23.15);
        System.out.println("Addition is" +add);
        System.out.println("Multiplication is" +mul);
        String nm=Tm1.getname("Nikhil");
        System.out.println("My Name is " +nm);



    }

}
