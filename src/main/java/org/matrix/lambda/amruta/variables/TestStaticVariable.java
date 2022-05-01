package org.matrix.lambda.amruta.variables;

public class TestStaticVariable {

    static int age;
    static String name;
    //This is static method
    static  void display(){
        System.out.println("Age is: "+age);
        System.out.println("Name is: "+name);
    }

    public static void main(String[] args) {
        age=20;
        name="Amu";
        display();
    }
}
