package org.matrix.delta.rahul;

public class InstanceVariable1 {
    int number = 52;
    String name;
    char col;

    public void m1() {
        System.out.println(number);
    }

    public static void main(String[] args) {
        InstanceVariable1 obj = new InstanceVariable1();
        obj.m1();
        System.out.println(obj.number);//instance variable can not call directly.
    }
}
