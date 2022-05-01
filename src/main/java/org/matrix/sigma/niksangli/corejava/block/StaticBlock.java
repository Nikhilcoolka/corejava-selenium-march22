package org.matrix.sigma.niksangli.corejava.block;

public class StaticBlock
{
    static int i;
    static
    {
        int i=10;
        System.out.println("This is block-1");

    }
    static
    {
        System.out.println("This is block-2");
    }
    StaticBlock()
    {
        System.out.println("This is constructor");
    }

    public static void main(String[] args)
    {
        StaticBlock b1=new StaticBlock();
        StaticBlock b2=new StaticBlock();
        StaticBlock b3=new StaticBlock();

    }



}
