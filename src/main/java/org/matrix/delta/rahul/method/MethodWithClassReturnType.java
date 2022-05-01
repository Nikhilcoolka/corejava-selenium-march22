package org.matrix.delta.rahul.method;

public class MethodWithClassReturnType {
    public static Employee getEmployee() {

        Employee ee = new Employee();
        return ee;
    }

    public static void main(String[] args) {
        Employee emp = getEmployee();
        System.out.println(emp.empId);
        System.out.println(emp.empName);
        System.out.println(Employee.company);

        Employee e = new Employee();
        e.getdata();
    }

}
