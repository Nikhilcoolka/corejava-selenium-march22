package org.matrix.lambda.akasht.corejava;

public class MethodChangingOrCallingNew {

    Employee emp;

    public void m1() {
        emp = new Employee();
        emp.getData(); //method calling
    }

    public void m2() {
        emp.getData();
    }

    public static void main(String[] args) {
        MethodChangingOrCallingNew obj = new MethodChangingOrCallingNew();
        obj.m1(); //method calling
        obj.m2();
    }

}
