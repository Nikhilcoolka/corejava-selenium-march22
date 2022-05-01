package org.matrix.sigma.pankaj.Method;


import org.matrix.sigma.pankaj.Employee;

public class TestMethodWithClassReturnType1 extends Employee   {

 public static Employee getEmployeedata(){
     Employee emp = new  Employee();
     return emp;
 }

        public static void main(String[] args) {
            Employee emp =   getEmployeedata();
            System.out.println(emp.empId);   // variable call
            System.out.println(emp.empname); // variable call
            System.out.println(company); // variable call

            emp.getdata(); // method call
        }
    }
