package org.matrix.sigma.niksangli.method;

import org.matrix.sigma.niksangli.Employee;

public class MethodChainNew {
    Employee e1 = new Employee();

    public void m1() {
        e1 = new Employee();
        //e1.getdata();
    }

    public void m2() {
        //e1.getdata();
    }


    public static void main(String[] args) {
        MethodChainNew mc1 = new MethodChainNew();
        mc1.m1();
        //mc1.m2();

    }
}
