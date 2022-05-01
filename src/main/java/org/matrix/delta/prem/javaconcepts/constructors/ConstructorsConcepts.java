package org.matrix.delta.prem.javaconcepts.constructors;

public class ConstructorsConcepts {

    int empId;
    String empName;

    public ConstructorsConcepts(){
        System.out.println("This is a no args Constructors");
    }

    public ConstructorsConcepts(int age) {
        System.out.println("My Age is ="+ age);
    }


    public static void main(String[] args) {
        ConstructorsConcepts obj = new ConstructorsConcepts();
        ConstructorsConcepts obj1 = new ConstructorsConcepts(26);
    }
}
