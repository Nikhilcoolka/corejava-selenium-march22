package org.matrix.sigma.akash.variable;

/* Note - To get the by default values of variable must be static and static variable assigned
outside the main method. */
class Employee {
}

public class TestDefaultValues {
    static int i;
    static boolean a;
    static long c;
    static byte d;
    static double e;
    static short f;
    static String g;
    static Employee ee;

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(ee);
    }
}
