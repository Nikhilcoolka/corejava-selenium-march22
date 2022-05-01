package org.matrix.lambda.komal.corejava.methods;

// methods without parameters Type

// why use methods-- to reduce code duplication

public class MethodsConcepts {

    //method declaration
    public void m1() {                          // instance method
        System.out.println("in m1 method");    //implementation
    }

    public static void m2() {                // static method
        System.out.println("in m2 method");
    }

    // methods with parameter Type

    public void m3(int age) {
        System.out.println("my age is :" + age);
    }

    public static void m4(int a ,int b){
        int c = a + b;
        System.out.println("my age is :" +c);
    }

    public static void main(String[] args) {
        MethodsConcepts obj = new MethodsConcepts();
        obj.m1();                  // method calling by ref var i.e. obj
        // obj.m2();                //don't use this
        // m2();
        MethodsConcepts.m2();   // calling by class name coz method is static method... recommended using this type

        obj.m3(20);
        obj.m3(30);

        //obj.m4();  //error coz m4 is static method
        MethodsConcepts.m4(4,4);     // calling by class name.method name coz m4 is static method
    }
}
