package org.matrix.alpha.nikhilesh.Construstor;

public class TestConstructorParameter {
    int empID;
    String empName;
    String empComy;

    public TestConstructorParameter(int a, String b) {
        System.out.println("Age :- " + a);
        System.out.println("Name :-" + b);
    }

    public TestConstructorParameter(int empID, String empName, String empComy) {
        this.empID = empID;
        this.empName = empName;
        this.empComy = empComy;
        System.out.println("Employee Id NO :" + empID);
        System.out.println("Employee Name :" + empName);
        System.out.println("Employee Company Name :" + empComy);
    }

    public static void main(String[] args) {
        TestConstructorParameter obj = new TestConstructorParameter(25, "nikhil");
        System.out.println("----------------------------");
       TestConstructorParameter obj1= new TestConstructorParameter(101,"Shri","japl");
    }
}
