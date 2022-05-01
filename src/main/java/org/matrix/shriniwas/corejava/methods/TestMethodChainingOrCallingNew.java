package org.matrix.shriniwas.corejava.methods;

import org.matrix.shriniwas.corejava.Employee;

public class TestMethodChainingOrCallingNew {
    Employee emp = new Employee();

    public void m1() {
        emp = new Employee();
        emp.getData(); // method calling
    }

    public void m2() {
        emp.getData();
    }

    public static void main(String[] args) {
        TestMethodChainingOrCallingNew obj = new TestMethodChainingOrCallingNew();
        obj.m1(); // method calling
        obj.m2();
    }

}
