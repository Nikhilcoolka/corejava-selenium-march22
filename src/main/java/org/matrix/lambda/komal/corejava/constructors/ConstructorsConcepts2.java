package org.matrix.lambda.komal.corejava.constructors;

public class ConstructorsConcepts2 {

    // constructor overloading
    /*ConstructorsConcepts2(){

    }
    ConstructorsConcepts2(int i){

    }
    ConstructorsConcepts2(int i,String str){

    }*/

    // constructor chaining

    // int i;     //assigned value by this.i
    ConstructorsConcepts2() {
        this(10, "ram");// this() is method here not keyword // this should be 1st statement
        //this();   // can not use this() twice
        System.out.println("in no args");
    }

    ConstructorsConcepts2(int i) {
        System.out.println("in single parameter");
    }

    ConstructorsConcepts2(int i, String str) {
        this(10);
        //this.i = i;     // we can assign value to instance var like this also
        System.out.println("in multi parameters");
    }


    public static void main(String[] args) {
        ConstructorsConcepts2 obj = new ConstructorsConcepts2();  // constructor is called first
        // new ConstructorsConcepts2();   //we can call direct via new no need of obj
    }
}
