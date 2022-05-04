package org.matrix.lambda.komal.corejava.constructors;

public class ConstructorChild extends ConstructorParent {

    ConstructorChild(){
        //super();       // compiler will add by default super() bcoz of extends // we'll not see super but it is there
        //this();        // we can not use this() and super() both
        System.out.println("in child constructor");
    }
    /*public void m1();{
        System.out.println("in method");
    }*/
    public static void main(String[] args) {
        new ConstructorChild();

        //ConstructorChild obj= new ConstructorChild();
        //obj.m1();                       // method calling by ref variable
        //new ConstructorChild().m1();    // method calling with out ref variavle
    }
}
