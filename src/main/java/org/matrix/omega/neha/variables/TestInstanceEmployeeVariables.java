package org.matrix.omega.neha.variables;

public class TestInstanceEmployeeVariables {
    int empId = 11;
    String empName = "Madhu";
    static String companyname = "Microsoft";

    void getdata() {
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(companyname);
    }

    public static void main(String[] args) {
        TestInstanceEmployeeVariables obj = new TestInstanceEmployeeVariables();
        obj.getdata();
        System.out.println("----------");
        
        Employee emp = new Employee();  //calling from previous class
        emp.display();
        // System.out.println(emp.empId);  //calling from previous class
        //System.out.println(emp.empName);//calling from previous class

    }
}
