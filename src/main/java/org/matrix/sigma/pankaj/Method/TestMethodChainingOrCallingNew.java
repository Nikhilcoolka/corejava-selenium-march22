package org.matrix.sigma.pankaj.Method;

import org.matrix.sigma.pankaj.Employee;

public class TestMethodChainingOrCallingNew {
    Employee emp;

    public void p1(){
       emp = new Employee();
       emp.getdata(); // method calling

    }

    public void p2(){
        emp.getdata();


    }


    public static void main(String[] args) {
        TestMethodChainingOrCallingNew obj = new TestMethodChainingOrCallingNew();
        obj.p1(); // method calling
        System.out.println("-----------");
        obj.p2();
    }
}
