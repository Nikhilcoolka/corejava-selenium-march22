package org.matrix.alpha.nikhilesh.Methods;

public class InstanceVariableNew {
    int a = 20;
    float f = 20.5f;
    double b = 102.5f;
    long l = 1001;
    int sum = 12;

    public void display() {
        System.out.println(a);
        System.out.println(f);
        System.out.println(b);
        System.out.println(l);
        System.out.println(sum);

    }

    public static void main() {

        InstanceVariableNew obj = new InstanceVariableNew();
        System.out.println(obj.a);
        System.out.println(obj.f);
        System.out.println(obj.b);
        System.out.println(obj.l);
        System.out.println(obj.sum);
    }
}