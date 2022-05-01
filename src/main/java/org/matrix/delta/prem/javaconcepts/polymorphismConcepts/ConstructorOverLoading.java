package org.matrix.delta.prem.javaconcepts.polymorphismConcepts;

public class ConstructorOverLoading {

    public ConstructorOverLoading(int a){
        System.out.println(a);
    }
    public  ConstructorOverLoading(){
        System.out.println("no argue constructor");
    }
    public ConstructorOverLoading(String ab, int c){
        System.out.println(ab +c);
    }

    public static void main(String[] args) {
       new ConstructorOverLoading();
       new ConstructorOverLoading(255);
       new ConstructorOverLoading("Prem Pandey",26);

      //we can overload constructor
    }
}
 //Runtime polymorphism overriding
