package org.matrix.alpha.shamal.java.method;

public class MethodChainingOrCallingNew {
    Employee emp = new Employee();

    public void m1() {
        emp = new Employee();
        emp.getData(2001,"ShamalMatale","TTC","IT-Operation"); // method calling
    }

    public void m2() {
        emp.getData(2002,"Shrenika","XYZ","HR");
    }

    public static void main(String[] args) {
        MethodChainingOrCallingNew obj = new MethodChainingOrCallingNew();
        obj.m1(); // method calling
        obj.m2();
    }
}
