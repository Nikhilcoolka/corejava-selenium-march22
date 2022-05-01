package org.matrix.sigma.niksangli.method;

public class MethodConceptNew
{
    int c = 100;
    int d = 200;

    public void addition(int a, int b)
    {
        System.out.println("Addition is" + a + b);
        System.out.println(c + d);

    }

    public void getdata(int age, String s1, String s2)
    {
        System.out.println(age);
        System.out.println(s1);
        System.out.println(s2);
    }

    public static void main(String[] args)
    {
        MethodConceptNew obj = new MethodConceptNew();
        obj.addition(20, 12);
        obj.getdata(31,"Nikhil","MMFSL");
    }
}
