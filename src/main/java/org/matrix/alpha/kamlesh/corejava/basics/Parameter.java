package org.matrix.alpha.kamlesh.basics;

public class Parameter {
    public static void d1(int a, int b, int c) {
        int d = a + b + c;
        System.out.println("Addition of " +d);
    }
    public void d2(int a, int b) {
        int c = a - b;
        System.out.println("Subtraction of " +c);
    }
    public void d3(double a, double b) {
        double c = a/b;
        System.out.println("Divide of " +c);
    }

    public static void main(String[] args) {
        Parameter obj = new Parameter();
        Parameter.d1(10,10,10);
        obj.d2(40,20);
        obj.d3(5,2);
    }
}
