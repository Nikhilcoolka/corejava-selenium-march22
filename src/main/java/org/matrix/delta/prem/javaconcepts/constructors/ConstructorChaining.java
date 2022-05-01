package org.matrix.delta.prem.javaconcepts.constructors;

public class ConstructorChaining {
    //constructor overloading example
    //chaining in same class
    public ConstructorChaining(){
        this(15); // this must be first statement otherwise it will show error/warning
        System.out.println("i m on args constructor");

    }
    public ConstructorChaining(int age){
        this(15,"hiii");
        System.out.println("i m single para constructor");

    }
    public ConstructorChaining(int age, String str){
        System.out.println("i m 2 para constructor");
    }

    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();
    }
}
