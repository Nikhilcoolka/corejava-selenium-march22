package org.matrix.sigma.niksangli.method;

import org.matrix.sigma.niksangli.Employee;

class TestMethodWithClassReturnType
{
    // how to return class from method i.e return class here getempdata return employee class
    public static Employee getEmpData()
    {
       Employee emp=new Employee();
       return emp;

    }

    public static void main(String[] args)
    {
        Employee e1=getEmpData();  // call method
        System.out.println(e1.empid);
        System.out.println(e1.empname);
        System.out.println(Employee.company);
        e1.getdata();

    }



}
