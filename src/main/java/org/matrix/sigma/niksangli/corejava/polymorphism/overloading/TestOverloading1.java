package org.matrix.sigma.niksangli.corejava.polymorphism.overloading;

public class TestOverloading1
{
    public void add(int a)
    {
        System.out.println(a);
    }

    public void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }

    public void add(String s1)
    {
        System.out.println(s1);
    }

    public void add(String s2,int b)
    {
        System.out.println("I am in getmethod");
    }
    public void add(int b,String s3)
    {
        System.out.println("I am in getmethod1");
    }
    public static void add1(String s1)
    {
        System.out.println("In static String method");
    }

    public void add1 (boolean p)
    {
        System.out.println("i am in static m3 boolean method");
    }




    public static void main(String[] args) {
        TestOverloading1 ts1=new TestOverloading1();
        ts1.add(10);
        ts1.add(34,33,11);
        ts1.add("Nik");
        ts1.add(90,"Shri");
        ts1.add("don",91);
        TestOverloading1.add1("Niki");
        ts1.add1(false);
        int [] d1={23,12,34};
        main(d1);

    }

    public static void main(int [] a1)
    {
        System.out.println("in array int main method" +a1[0]);
    }
}
