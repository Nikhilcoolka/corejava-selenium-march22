package org.matrix.delta.ganesh.Methods;

public class MethodWithClassReturnType {

    public IamEmployee getEmployeeClass() {
        IamEmployee employee = new IamEmployee();
//        return new IamEmployee();
        return employee;
    }


    public IamEmployee getEmpDetails(IamEmployee employee) {
        return employee;

    }

    public static void main(String[] args) {

        MethodWithClassReturnType obj = new MethodWithClassReturnType();
//        obj.getEmployeeClass(new IamEmployee());
        IamEmployee iamEmployee1 = obj.getEmployeeClass();
        System.out.println(iamEmployee1.empID);
        System.out.println(iamEmployee1.empName);
//        System.out.println(iamEmployee1.company);
        System.out.println(IamEmployee.company);

        iamEmployee1.getEmpData();
        System.out.println("-------------------------");

        IamEmployee iamEmployee2 = new IamEmployee();
        obj.getEmpDetails(iamEmployee2);
        iamEmployee2.getEmpData();
    }
}
