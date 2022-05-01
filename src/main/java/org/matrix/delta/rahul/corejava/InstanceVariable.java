package org.matrix.delta.rahul.corejava;

public class InstanceVariable {
    int a = 15;
    int b = 25;

    InstanceVariable() {
        System.out.println(a);
    }

    public void display() {
        System.out.println(b);
    }

    public static void main(String[] args) {
        InstanceVariable e = new InstanceVariable();
        //System.out.println(a);
        e.display();
    }
}
