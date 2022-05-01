package org.matrix.sigma.sunanda.ConceptsOfJava.ConstructorConcept;

public class ChildConstructor extends ParentConstructor {
    ChildConstructor(){
        super();
        System.out.println("ChildConstructor :: Constructor");
    }

    public static void main(String[] args) {
        ChildConstructor obj = new ChildConstructor();
    }
}
