package org.matrix.sigma.sunanda.ConceptsOfJava.ConstructorConcept;

public class SimpleConstructor {
    int age;
    String name;
    public SimpleConstructor() {
        System.out.println("This is a No-args constructor");
    }
    public SimpleConstructor(int age) {
        System.out.println("My age is: " + age);
    }

    public static void main(String[] args) {
        SimpleConstructor obj = new SimpleConstructor();
        SimpleConstructor obj1 = new SimpleConstructor(10);
    }
}

