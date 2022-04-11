package org.matrix.lambda.akashgupta.javaconcepts.basic;

import org.matrix.lambda.akashgupta.javaconcepts.classes.Employee;

public class Variables {
    static int i;
    static byte b;
    static short s;
    static boolean bb;
    static float f;
    static double d;
    static String str;       //learn why NullPointerException
    static Employee obj = new Employee();

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
        System.out.println(bb);
        System.out.println(f);
        System.out.println(d);
        //System.out.println(str.length());
        System.out.println(obj);
        System.out.println(obj.empId);
        System.out.println(obj.empName);
        System.out.println(Employee.company);
    }
}

