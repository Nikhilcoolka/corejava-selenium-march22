package org.matrix.delta.monika.import1;

public class EmployeeTestStaticVariables {
    int empid1 = 100;
    String empname1 = "Monika";
    String companyname1 = "XYZ";

    int empid2 = 101;
    String empname2 = "mona";
    String Companyname2 = "ABC";

    public void getData1() {
        System.out.println(empid1);
        System.out.println(empname1);
        System.out.println(companyname1);

    }

    public void getData2() {
        System.out.println(empid2);
        System.out.println(empname2);
        System.out.println(this.Companyname2);
    }

    public static void main(String[] args) {
        EmployeeTestStaticVariables emp1 = new EmployeeTestStaticVariables();
        emp1.getData1();
        System.out.println("-------");
        EmployeeTestStaticVariables emp2 = new EmployeeTestStaticVariables();
        emp2.getData2();
        System.out.println("-------");
    }

}
