package org.matrix.delta.rahul.corejava;

public class LocalMethodPriority {
    static int m;
    static int n;

    public void addition(int a, int b) {
        int data;
        System.out.println(a + b);// value of a & b is accepted from main method
    }

    public static void main(String[] args) {
        LocalMethodPriority obj = new LocalMethodPriority();
        obj.addition(20, 10);
        LocalMethodPriority.m = 12;
        LocalMethodPriority.n = 52;
        System.out.println(m);
        System.out.println(n);
    }
}
