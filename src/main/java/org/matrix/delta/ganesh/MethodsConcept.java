package org.matrix.delta.ganesh;

public class MethodsConcept {

    MethodsAccess methodsAccess;

    int multiply;

    public void getMethod() {
        methodsAccess = new MethodsAccess();
        MethodsAccess.college();
    }

    public void getMethod1() {
        methodsAccess.university();
    }

    public void firstMethod() {
        System.out.println("First Method");
    }

    public void secondMethod() {
        System.out.println("Second Method");
    }

    public void add(int a, int b) {
        int h = a + b;
        System.out.println("Addition: " + h);

    }

    public int mul(int a, int b) {
        multiply = a * b;
        return multiply;
    }


    public static void main(String[] args) {
        MethodsConcept methodsConcept = new MethodsConcept();
        methodsConcept.firstMethod();
        methodsConcept.secondMethod();

        methodsConcept.add(10, 20);

        int f = methodsConcept.mul(10, 20);
        System.out.println("Mul :" + f);

        methodsConcept.getMethod();
        methodsConcept.getMethod1();
    }
}
