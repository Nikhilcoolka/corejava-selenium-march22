package org.matrix.delta.rahul.constuctor;

public class ConstructorChaining2 extends ConstructorChaining {
    ConstructorChaining2() {
        super(10,"Ganesh");//called the outside class constructor using extend super keyword.
        System.out.println("i am the constructor of this class");

    }

    public static void main(String[] args) {
        new ConstructorChaining2();
    }
}
