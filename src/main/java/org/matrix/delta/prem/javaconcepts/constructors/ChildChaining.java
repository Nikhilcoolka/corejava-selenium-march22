package org.matrix.delta.prem.javaconcepts.constructors;

public class ChildChaining extends ParentChaining {
    //chaining from different class

    ChildChaining() {
        //compiler will add super() as a first statement in constructor which will call constructor of parent class
        //automatically and if we didn't extend then also super() will be there its by
        //default

        System.out.println("Child :: constructor");
    }

    public static void main(String[] args) {
        ChildChaining obj = new ChildChaining();

    }
}
