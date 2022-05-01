package org.matrix.sigma.sunanda.ConceptsOfJava.MethodConcept;

public class MethodWithParameters {
    public void m3(int age){
        System.out.println("My age is:"+age);
    }
    public static void m4(int age){
        System.out.println("static method .. My age is:"+age);
    }

    public static void main(String[] args) {
        MethodWithParameters obj = new MethodWithParameters();
        obj.m3(100);
        m4(30);
        MethodWithParameters.m4(25);
    }
}
