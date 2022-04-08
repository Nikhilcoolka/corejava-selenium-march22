package org.matrix.sigma.prajakta.corejava.methods;

import org.matrix.sigma.prajakta.corejava.EmployeeDemo;

public class  MethodWithClassParameter {

    public static EmployeeDemo getData(){
        //EmployeeDemo ee=new EmployeeDemo();
        return new EmployeeDemo();
    }

    public EmployeeDemo getData1(EmployeeDemo e){
        return e;
    }

    public static void main(String[] args) {
        EmployeeDemo ee=getData();
        System.out.println(ee.empId);
        System.out.println(ee.empName);
        System.out.println(ee.empCompany);

        MethodWithClassParameter obj=new MethodWithClassParameter();
        EmployeeDemo emp=new EmployeeDemo();
        obj.getData1(emp);


    }

}
