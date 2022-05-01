package org.matrix.lambda.komal.corejava.variables;

// local variables are present inside methods constructors or blocks

public class LocalVariables {



    //inside constructor
    LocalVariables() {
        int age = 20;      // local variable needed to initialize i.e. need to assign value
    }

    //inside blocks
    {
        int age = 20;
    }

    public static void main(String[] args) { //scope is limited to this method /constructor/blocks
        int age = 13;                       // method starts -memory allocate....method ends-memory deallocate in stack
        System.out.println(age);
    }
    /*
    public void m1(){               //no parameter method
        int age =100               // by doing this age is accesible
        System.out.println(age);  //different method so can't access here --solution see above line
    }
     */

    //*
    public void m1(String str) {  // parameterised method so str is accesible in this method only not outside coz local variable

        System.out.println(str);
    }
    //
}
