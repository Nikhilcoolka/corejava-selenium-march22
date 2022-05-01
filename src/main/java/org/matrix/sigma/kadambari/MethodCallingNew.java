package org.matrix.sigma.kadambari;

public class MethodCallingNew {
    public void m1() {
        Employee emp = new Employee();//object creation
        emp.getData();// method calling
    }

    public static void main(String[] args) {
        MethodCallingNew obj = new MethodCallingNew();
        obj.m1();//method calling
    }
}
