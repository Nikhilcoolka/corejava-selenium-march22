package org.matrix.alpha.shamal.java.contructor;

public class ContructorChaining {

    public ContructorChaining(){
        this(10);
        System.out.println("This is the No argument constructor");
    }

    public ContructorChaining(int id ){

        System.out.println("This is the parametrised constructor");

    }

    public ContructorChaining(String name, int id) {
        this();
        System.out.println("This is the parametrised constructor ");
    }

    public static void main(String[] args) {
        ContructorChaining obj = new ContructorChaining();
    }



}
