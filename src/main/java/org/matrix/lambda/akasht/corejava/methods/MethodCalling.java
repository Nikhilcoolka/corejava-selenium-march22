package org.matrix.lambda.akasht.corejava.methods;

public class MethodCalling {


    public void m1() {
        System.out.println("Information Science and engineering.");
        m2();
    }

    public void m2() {
        System.out.println("Biomedical Engineering.");
        m3();
    }


    public void m3() {
        System.out.println("Soft DeptElectronics and Instrumentation Engineering.");
        m4();
    }

    public void m4() {
        m5();
        System.out.println("Instrumentation and Control.");
    }


    public void m5() {
        m6();

        System.out.println("Mechatronics");
    }

    public void m6() {
        System.out.println("Mining Engineering");

    }

    public void m7() {
        System.out.println("Production engineering");
    }

    public static void main(String[] args) {
        MethodCalling Object = new MethodCalling();
        Object.m1();

    }
}