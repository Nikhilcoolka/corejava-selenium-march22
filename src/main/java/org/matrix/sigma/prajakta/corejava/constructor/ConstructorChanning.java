package org.matrix.sigma.prajakta.corejava.constructor;

public class ConstructorChanning {

    int id;
    String name;

    public ConstructorChanning(){
        this(110);
        System.out.println("No args constructor");
    }

    public  ConstructorChanning(int id){
        this("Prajakta");
        System.out.println("Integer : Parameterized constructor ");
    }

    public ConstructorChanning(String name){
        System.out.println("In parameterized constructor with String parameter");
    }

    public static void main(String[] args) {
        new ConstructorChanning();
    }
}
