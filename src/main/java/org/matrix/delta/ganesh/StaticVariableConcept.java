package org.matrix.delta.ganesh;

public class StaticVariableConcept {

    static int s = 300;

    {
        System.out.println("Static Variable in block - " + s);
    }

    StaticVariableConcept() {
        System.out.println("Static Variable in constructor - " + s);

    }

    public void display() {
        System.out.println("Static Variable in method - " + s);
    }

    public static void main(String[] args) {
        System.out.println("In main method - " + s);
        System.out.println("Access by company name - " + StaticVariableConcept.s);
        StaticVariableConcept staticVariableConcept = new StaticVariableConcept();
        staticVariableConcept.display();
    }


}
