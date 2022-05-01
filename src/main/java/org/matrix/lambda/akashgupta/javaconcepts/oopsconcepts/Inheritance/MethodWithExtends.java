package org.matrix.lambda.akashgupta.javaconcepts.oopsconcepts.Inheritance;

import org.matrix.lambda.akashgupta.javaconcepts.corejava.classes.Employee;

public class MethodWithExtends extends Employee {

    public void chainConcept(){
        System.out.println("This is local method");
        this.getData();
    }

    public void getData(){
        System.out.println("This is local method getData()");
        System.out.println("Calling parent class method with same name using super.methodName");
        super.chainConcept();
        super.getData();

    }

    public static MethodWithExtends createObject(){
        return new MethodWithExtends();
    }

    public static void main(String[] args) {
        MethodWithExtends obj = createObject();
        obj.chainConcept();
    }
}
