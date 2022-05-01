package org.matrix.sigma.akash.variable;

public class TestLocalVariable {
    TestLocalVariable() {//We have assigned one variable which is inside the constructor.
        // whenever we create object of class it automatically call the constructor

        int i = 10;
        System.out.println("The value is from constructor is - " + i);
        System.out.println("-----------------");
    }

    public void name() {// variable assigned into the method. its non-static method.
        int i = 10;
        String str = "Akash";
        System.out.println("Roll No. " + i);
        System.out.println("Name - " + str);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to local variable Concept");
        System.out.println("---------------");
        TestLocalVariable obj = new TestLocalVariable();//created object to call method.
        obj.name();//calling method.
        System.out.println("Welcome to local variable learning");


    }
}
