package org.matrix.sigma.akash.variable;

public class TestStaticVariable {
    int empId = 10; //non-static
    String empName1 = "Akash";//non-static
    int empId1 = 20; //non-static
    String empName2 = "Vaani";//non-static
    static String companyName = "TCS";//static variable

    public void emp1() {
        System.out.println("your are in emp1");
        System.out.println("Emp Id " + empId);
        System.out.println("Emp Name " + empName1);
        System.out.println("Company Name " + TestStaticVariable.companyName);//by using class name
    }

    public void emp2() {
        System.out.println("your are in emp2");
        System.out.println("Emp Id " + empId1);
        System.out.println("Emp Name " + empName2);
        System.out.println("Company Name " + companyName);//We can directly use static variables in static and non static method
    }

    public static void main(String[] args) {
        TestStaticVariable obj = new TestStaticVariable();
        obj.emp1();
        System.out.println("------------------");
        //TestStaticVariable obj1 = new TestStaticVariable();
        obj.emp2();


    }
}
