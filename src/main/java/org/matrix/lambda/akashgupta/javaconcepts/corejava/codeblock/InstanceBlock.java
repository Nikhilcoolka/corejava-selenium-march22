package org.matrix.lambda.akashgupta.javaconcepts.corejava.codeblock;

public class InstanceBlock {
    {                           // no static keyword i.e: instance block 1
        System.out.println("This is instance block 1");
        System.out.println("It is invoked everytime a object is created");
    }
    {                           // instance block 2
        System.out.println("This is instance block 2");
        System.out.println("It is invoked in serial and before 'constructor()' ");
        {      // you can have instance block nested, but static block is not allowed inside instance block
            System.out.println("This is inner instance block 3 of instance block 2");
        }
    }
    InstanceBlock(){
        System.out.println("You are in Constructor\n" +
                "Object is created ......................");
    }

    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock();
    }
}
