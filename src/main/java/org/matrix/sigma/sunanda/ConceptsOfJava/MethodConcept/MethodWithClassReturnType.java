package org.matrix.sigma.sunanda.ConceptsOfJava.MethodConcept;

import org.matrix.shriniwas.corejava.Employee;

public class MethodWithClassReturnType {
    public static Employee
    getEmployeeData(){
       Employee emp  =  new Employee();
       return emp ;

    }

    public static void main(String[] args) {
        Employee ee = getEmployeeData();
        System.out.println(ee.empId);  // var call
        System.out.println(ee.empName);
        System.out.println(Employee.company);
        ee.getData();
    }
}
