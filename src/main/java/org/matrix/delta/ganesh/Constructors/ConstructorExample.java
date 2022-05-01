package org.matrix.delta.ganesh.Constructors;

public class ConstructorExample {

    public ConstructorExample(){
        System.out.println("In No Argument Constructor");
    }

    public ConstructorExample(int a){
        System.out.println("In Param Constructor: "+a);
    }

    public static void main(String[] args) {
        ConstructorExample constructorExample = new ConstructorExample();
        ConstructorExample constructorExample1 = new ConstructorExample(10);
    }
}
