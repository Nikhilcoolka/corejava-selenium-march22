package org.matrix.delta.rahul.variable;

public class InstanceVariable2 {
    int age=100;
    {
        System.out.println(age); //use in instance block
    }

    public static void main(String[] args) {
        InstanceVariable2 obj=new InstanceVariable2();
        System.out.println(obj.age);
    }
}
