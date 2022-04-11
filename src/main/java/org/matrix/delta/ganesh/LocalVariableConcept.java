package org.matrix.delta.ganesh;

public class LocalVariableConcept {

//    int z; // instance variable

//        static
//     {
//        static int z = 10;
//        System.out.println("In block - " +z);
//        System.out.println(z);
//    }

    LocalVariableConcept() {
        int z = 20;
        System.out.println("In constructor - " + z);
        System.out.println(z);
    }

    public void display() {
        int z = 30;  // local variable
        System.out.println("In display method - " + z);
        System.out.println(z);
    }

    public static void main(String[] args) {
//        System.out.println(z);
        LocalVariableConcept localVariableConcept = new LocalVariableConcept();
        localVariableConcept.display();
    }
}
