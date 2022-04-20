package org.matrix.omega.jagannath;

public class MethodsWithoutParameter {
    //Method Declaration
    public void method1() {
        System.out.println("I am in method 1");
    }

    public static void method2() {
        System.out.println("I am in method 2");
    }

    public static void main(String[] args) {
     MethodsWithoutParameter obj= new MethodsWithoutParameter();
     obj.method1(); //Method calling by using ref variable
     MethodsWithoutParameter.method2(); //Method calling by using class name
    }
}
