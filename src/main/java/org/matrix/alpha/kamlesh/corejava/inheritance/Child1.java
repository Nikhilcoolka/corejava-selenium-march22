package org.matrix.alpha.kamlesh.inheritance;

//Accesing Parent class Constructor
public class Child1 extends Parent1 {
                                            //Here by default it is adding parent constructor using super method.
    public Child1() {

        System.out.println("I am Child 1 Constructor");
    }

    public static void main(String[] args) {
        new Child1();

    }
}
