package org.matrix.delta.rahul.block;

import org.matrix.delta.rahul.corejava.ExampleClass2;

public class InstanceBlacks {

    //Instance Blocks are run before object creation  also it runs for each object creations
    {
        System.out.println("Wel Come to you in the IntellijIdea");
    }

    public static void main(String[] args) {

        new InstanceBlacks();
        System.out.println("-------------");
        new InstanceBlacks();
        ExampleClass2 obj=new ExampleClass2();//we call other class instance block by using ref variable.

    }
    {
        System.out.println("My name is Rahul");
    }
}
