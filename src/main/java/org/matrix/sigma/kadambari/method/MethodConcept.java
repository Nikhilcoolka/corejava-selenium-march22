package org.matrix.sigma.kadambari.method;

public class MethodConcept {
    int a = 50;
    int b = 40;

    public void add(int a, int b) {
        System.out.println(this.a + this.b);//this refer to current class instance
        System.out.println(a + b);

    }

    public static void main(String[] args) {
        MethodConcept obj = new MethodConcept();
        obj.add(10, 20);

    }
}

