package org.matrix.sigma.prajakta.corejava.methods;

public class MethodConcepts {

    //Method with parameter
    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition :-" + c);
    }

    //method without parameter
    public void mul() {
        int m = 20;
        int n = 50;
        int l = m * n;
        System.out.println("Multiplication:-" + l);
    }

    public static void main(String[] args) {
        MethodConcepts obj = new MethodConcepts();
        obj.add(10, 20);
        obj.mul();
    }
}
