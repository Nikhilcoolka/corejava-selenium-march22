package org.matrix.sigma.pankaj.Method;

import org.matrix.sigma.pankaj.corejava.Employee;

public class TestMethodWithClassReturnType {

    public static Employee getEmployeedata(){
        //Employee emp = new  Employee();
        return new Employee();
    }
    public Employee getEmployee(Employee e){
        return e;
    }
    public String getName(String str){
        return str;
    }


    public static void main(String[] args) {
      Employee emp =   getEmployeedata();
        System.out.println(emp.empId);   // variable call
        System.out.println(emp.empname); // variable call
        System.out.println(Employee.company); // variable call

        emp.getdata(); // method call

        TestMethodWithClassReturnType obj = new TestMethodWithClassReturnType();
        Employee e = new Employee();
        obj.getEmployee(e);

        obj.getName("PANKAJ");


    }

}
