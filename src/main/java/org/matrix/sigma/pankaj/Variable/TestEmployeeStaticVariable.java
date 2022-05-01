package org.matrix.sigma.pankaj.Variable;

public class TestEmployeeStaticVariable {
    int empId1 = 101;
    String empname1 = "Pankaj";
    String companyname = "TCS";

    int empId2 = 102;
    String empname2 = "Pankaj1";


    public void getdata() {
        System.out.println(empId1);
        System.out.println(empname1);
        System.out.println(companyname);
    }

    public void getdata1() {
        System.out.println(empId2);
        System.out.println(empname2);
        System.out.println(companyname);
    }

    public static void main(String[] args) {
        TestEmployeeStaticVariable emp1 = new TestEmployeeStaticVariable();
        emp1.getdata();  // method calling getdata just like variable
        System.out.println("............."); //this is called seperater
        TestEmployeeStaticVariable emp2 = new TestEmployeeStaticVariable();
        emp2.getdata1();
    }

}
  // some part in remaining