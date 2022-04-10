package org.matrix.lambda.nisha.methods;

//-------Types of methods---------
// 1. Methods Without Parameters
// eg. = public void a(){}
//     = public static void b()

public class TestMethodsConcept {

    // --Instance Method---
    public void a() {                                           // method declaration
        System.out.println("Im in instance a method ");         // method implementation
    }

    // --Static Method---
    public static void b() {
        System.out.println("Im in static b method ");
    }




    //-------Types of methods---------
    // 2. Method With Parameters

    public void c(String abc) {
        System.out.println("My Favourite car name is " + abc);
    }

    public static void main(String[] args) {
        TestMethodsConcept ref = new TestMethodsConcept();
        ref.a();                          // method calling by using ref variable
        //TestMethodsConcept.b();       // method calling by using class name
        b();

        ref.c("Rolls Royce");         // passing the value to the method
    }
}

