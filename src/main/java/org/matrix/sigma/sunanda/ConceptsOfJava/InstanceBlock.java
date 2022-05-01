package org.matrix.sigma.sunanda.ConceptsOfJava;

public class InstanceBlock {
    {
        System.out.println("I am in Instance Block1"); // logic
    }
    {
        System.out.println("I am in Instance Block2"); // logic
    }
    public InstanceBlock(){
    System.out.println("In Constructor");  // logic
    }
    public InstanceBlock(int i){
        System.out.println("In 1-args Constructor");
    }

    public static void main(String[] args) {
        InstanceBlock obj1 =  new InstanceBlock();
        InstanceBlock obj2 =  new InstanceBlock(10);
        System.out.println("-------------------");
        InstanceBlock obj3 =  new InstanceBlock();
    }
}


