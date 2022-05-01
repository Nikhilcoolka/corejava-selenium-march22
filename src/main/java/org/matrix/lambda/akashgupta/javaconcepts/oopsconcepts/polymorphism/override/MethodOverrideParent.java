package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.polymorphism.override;

public class MethodOverrideParent {

    public void m1() {
        System.out.println("Parent m1......override");
    }

    public int m2() {
        System.out.println("Parent m2......override");
        return 0;
    }
    //if you are using overloaded methods in child it should also be present in parent
    //with same signature,Parameter & return type
    /*public String m1(int a){
        System.out.println("parent m1 ........ overloading");
        return null;
    }*/

}
