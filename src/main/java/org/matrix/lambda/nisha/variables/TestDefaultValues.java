package org.matrix.lambda.nisha.variables;

/*
class Employee {

}
 */

public class TestDefaultValues {

    /*
        Access specifiers or modifiers
        Syntax declaration: <AccessSpecifier> <DataType> <VariableName> = <Value>;

    public string myName = "Nisha";          //public type members are accessible to same and any other classes too
    private int bankPwd = 1234;              //private type members are only accessible to same class
    protected string homeProperty = "House"; //protected type members are accessed only in child class

    final float pi = 3.14f;                 //PI value is a fixed value so we declare it with final keyword

     */

// By default values given by JVM

    static byte b;      // b=0
    static int i;       // i=0
    static short s;     // s=0
    static long l;      // l=0
    static double d;    // d=0.0
    static float f;     // f=0.0
    static char c;      // char
    static boolean bb;  // bb=false
    static String ni;   // ni=null
    //static Employee ee; // Employee is a class=null

    public static void main(String[] args) {
        System.out.println(b);
        System.out.println(i);
        System.out.println(s);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
        System.out.println(c);
        System.out.println(bb);
        System.out.println(ni);
        //System.out.println(ee);
    }
}
