package org.matrix.lambda.akashgupta.javaconcepts.corejava.codeblock;

public class StaticBlock {
    static int sCount;
    int iCount;             //instance variable scope is local to its respective object
    static {                // static keyword is used to declare Static block
        System.out.println("You are in static block\n"+
                "Its is invoked Once when 1st object is created\n"
                +"As always block are invoked before Constructor ");
    }
    {               // instance block
        System.out.println("this is instance block invoked for every instance(object) of class");
    }
    StaticBlock(){
        sCount++;
        this.iCount++;

        System.out.println("You are in Constructor");
    }
    public  void dispObjectCount(){
        System.out.println("Total "+sCount+" Object is created..........\n"
                +"Instance variable count is "+this.iCount+".............");
    }
    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        obj1.dispObjectCount();
        StaticBlock obj2 = new StaticBlock();
        obj2.dispObjectCount();
        StaticBlock obj3 = new StaticBlock();
        obj3.dispObjectCount();
    }
}
