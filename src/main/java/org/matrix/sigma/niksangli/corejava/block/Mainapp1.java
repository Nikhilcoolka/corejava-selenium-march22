package org.matrix.sigma.niksangli.corejava.block;

public class Mainapp1
{
    static
    {
        System.out.println("This is 1st block");
    }
    static
    {
        System.out.println("This is 2nd block");
    }

    public static void main(String[] args)
    {
        System.out.println("Main method");
        Mainapp1 obj=new Mainapp1();
    }
    static
    {
        System.out.println("Static block of main application");
    }

}

