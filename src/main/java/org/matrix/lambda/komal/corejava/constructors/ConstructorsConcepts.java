package org.matrix.lambda.komal.corejava.constructors;

// constructors do not have return type
// name is same as class
public class ConstructorsConcepts {
    int empId;
    String empName;

    public ConstructorsConcepts() {                      // zero parameterized constructor
        System.out.println("in no arg constructor");
    }

    public ConstructorsConcepts(int age) {             //parameterized constructor
        System.out.println("my age is :" + age);
    }


    public static void main(String[] args) {
        ConstructorsConcepts obj = new ConstructorsConcepts();
        ConstructorsConcepts obj1 = new ConstructorsConcepts(10);
    }
}
