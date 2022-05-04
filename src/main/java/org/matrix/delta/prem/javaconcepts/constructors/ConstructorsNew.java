package org.matrix.delta.prem.javaconcepts.constructors;

public class ConstructorsNew {
    int empId;
    String empName;

    public ConstructorsNew(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
//constructors are used to initialize instance variable at the time of object creation
    //this is used to initialize instance variable and to directly assign value to it
    public void getEmployeeData(){
        System.out.println("EmpId = " + empId);
        System.out.println("EmpName = " + empName);
    }

    public static void main(String[] args) {
        ConstructorsNew obj = new ConstructorsNew(15, "Prem");
        obj.getEmployeeData();

        System.out.println("-----------------------");

        ConstructorsNew obj1 = new ConstructorsNew(26, "Pandey");
        obj1.getEmployeeData();
    }
}
